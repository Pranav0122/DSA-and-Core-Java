package Graph;

import java.util.Arrays;

public class DSUOptimised {
    int V;
    int[] parent;
    int[] rank;
    int[] height;
    DSUOptimised(int v){
        V=v;
        parent=new int[v];
        Arrays.fill(parent,-1);
        rank=new int[v];
        Arrays.fill(rank,1);
        height=new int[v];
        Arrays.fill(height,1);
    }

    private int find(int u){
        if(parent[u]==-1){
            return u;
        }
        return parent[u]=find(parent[u]);
    }

    private void unionByHeight(int u,int v){
        int godFatherU=find(u);
        int godFatherV=find(v);
        if(height[godFatherU]<height[godFatherV]){
            parent[godFatherU]=godFatherV;
        }
        else if(height[godFatherV]<height[godFatherU]){
            parent[godFatherV]=godFatherU;
        }
        else {
            parent[godFatherU]=godFatherV;
            height[godFatherV]++;
        }
    }

    private void unionBySetSize(int u,int v){
        int godFatherU=find(u);
        int godFatherV=find(v);
        if(rank[godFatherU]<rank[godFatherV]) {
            parent[godFatherU] = godFatherV;
            rank[godFatherV]+=rank[godFatherU];
        }
        else{
            parent[godFatherV] = godFatherU;
            rank[godFatherU]+=rank[godFatherV];
        }
    }

    private void union(int u,int v){
        int godFatherU=find(u);
        int godFatherV=find(v);
        if(godFatherU!=godFatherV){
            parent[godFatherU]=godFatherV;
        }
    }

    private boolean detectCycle(int[][] edgeList){
        for (int r=0;r<edgeList.length;r++){
            int u=edgeList[r][0];
            int v=edgeList[r][1];

            int godFatherU=find(u);
            int godFatherV=find(v);

            if(godFatherU!=godFatherV){
                unionByHeight(godFatherU,godFatherV);
            }
            else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int numV=7;
        int[][] edgeList={{0,1},{1,2},{2,3},{3,1},{4,5},{4,6}};
        DSUOptimised dsu=new DSUOptimised(numV);
        System.out.println(dsu.detectCycle(edgeList));
    }
}
