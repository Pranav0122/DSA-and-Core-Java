package Graph;

import java.util.Arrays;

public class DSUUnoptimised {
    int V;
    int[] parent;
    DSUUnoptimised(int v){
        V=v;
        parent=new int[V];
        Arrays.fill(parent,-1);
    }
    private int find(int u){
        if(parent[u]==-1){
            return u;
        }
        return parent[u]=find(parent[u]);
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
                union(godFatherU,godFatherV);
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
        DSUUnoptimised dsu=new DSUUnoptimised(numV);
        System.out.println(dsu.detectCycle(edgeList));
    }
}
