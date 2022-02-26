package StackQuestions;

import java.util.Arrays;
import java.util.Stack;

public class MaximalRectangle {
    private static int rectangleArea(int ht[]){
        int maxArea=Integer.MIN_VALUE;
        int nse[]=new int[ht.length];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for (int curr=1;curr<ht.length;curr++){
            while(!st.isEmpty() && ht[st.peek()]>ht[curr]){
                nse[st.pop()]=curr;
            }
            st.push(curr);
        }

        while (!st.isEmpty()){
            nse[st.pop()]=ht.length;
        }
        st=new Stack<>();
        int pse[]=new int[ht.length];
        st.push(0);
        pse[0]=-1;
        for(int curr=1;curr<ht.length;curr++){
            while (!st.isEmpty() && ht[st.peek()]>=ht[curr]){
                st.pop();
            }
            if(!st.isEmpty()){
                pse[curr]=st.peek();
            }
            else{
                pse[curr]=-1;
            }
            st.push(curr);
        }

        for(int i=0;i<ht.length;i++){
            int area=ht[i]*(nse[i]-pse[i]-1);
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 0, 1, 0, 0}, {1, 0, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 0, 0, 1, 0}};
        int maxArea = Integer.MIN_VALUE;
        int ht[] = new int[arr[0].length];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if(arr[r][c]==1)
                    ht[c]=ht[c]+1;
                else
                    ht[c]=0;
            }
            int area=rectangleArea(ht);
            maxArea=Math.max(maxArea,area);
        }
        System.out.println(maxArea);
    }
}
