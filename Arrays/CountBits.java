package Arrays;

import java.util.Stack;

public class CountBits {
    public static void main(String[] args) {
        int n=161;
        int ind=1;
        Stack<Integer>st=new Stack<>();
        while(n>0){
            if((n & 1) == 1){
                st.push(ind);
            }
            n=n>>1;
            ind++;
        }
        System.out.println(st);
    }
}
