package Graph;

import java.util.Arrays;

public class Dijkstra {
    private static void dijkstraAlgo(int[][] graph,int src){
        boolean[] vis=new boolean[graph.length];
        vis[src]=true;
        int[] dis=new int[graph.length];
        for (int i=0;i< dis.length;i++)
            dis[i]=graph[src][i];
        dis[src]=0;
        System.out.println("Node chosen is: "+src);
        for(int i=1;i<graph.length;i++){
            int minDist=Integer.MAX_VALUE;
            int targetV=-1;
            for(int v=0;v<graph.length;v++){
                if(!vis[v] && minDist>dis[v]){
                    targetV=v;
                    minDist=dis[v];
                }
            }
            System.out.println("Node chosen is: "+targetV);
            vis[targetV]=true;
            for(int v=0;v<graph.length;v++){
                if(!vis[v] && graph[targetV][v]!=Integer.MAX_VALUE&&dis[v]>dis[targetV]+graph[targetV][v]){
                    dis[v]=dis[targetV]+graph[targetV][v];
                }
            }
        }
        System.out.println(Arrays.toString(dis));
    }
    public static void main(String[] args) {
        int[][] graph={{0,5,10,0,0},
                {5,0,3,11,0},
                {10,3,0,2,0},
                {0,11,2,0,3},
                {0,0,0,3,0}
        };
        for(int r=0;r<graph.length;r++){
            for(int c=0;c<graph[r].length;c++){
                if(r!=c && graph[r][c]==0){
                    graph[r][c]=Integer.MAX_VALUE;
                }
            }
        }
//        for(int i=0;i<graph.length;i++) {
//            System.out.println(Arrays.toString(graph[i]));
//        }
        dijkstraAlgo(graph,1);
    }
}
