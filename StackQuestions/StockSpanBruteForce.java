package StackQuestions;

import java.util.Arrays;

public class StockSpanBruteForce {
    public static void main(String[] args) {
        int[] ht={1,2,4,5,3};
        int span[]=new int[ht.length];
        Arrays.fill(span,1);
        for(int buildInd=1;buildInd<ht.length;buildInd++){
            for(int preBuild=buildInd-1;preBuild>=0;preBuild--){
                if(ht[preBuild]<ht[buildInd])
                    span[buildInd]++;
                else
                    break;
            }
        }
        for (int sp:span)
            System.out.print(sp+" ");
    }
}
