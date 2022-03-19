package Graph;

import java.util.Arrays;

public class Stones {
    static class DSUUnoptimised {
        int V;
        int[] parent;

        DSUUnoptimised(int v) {
            V = v;
            parent = new int[V];
            Arrays.fill(parent, -1);
        }

        private int find(int u) {
            if (parent[u] == -1) {
                return u;
            }
            return parent[u] = find(parent[u]);
        }

        private int union(int u, int v) {
            int godFatherU = find(u);
            int godFatherV = find(v);
            if (godFatherU != godFatherV) {
                parent[godFatherU] = godFatherV;
                return 1;
            }
            return 0;
        }
    }

    public int removeStones(int[][] stones) {
        DSUUnoptimised dsu=new DSUUnoptimised(stones.length+1);
        int count=0;
        for(int i=0;i<stones.length-1;i++){
            for (int j=i+1;j<stones.length;j++){
                int[] v1=stones[i];
                int[] v2=stones[j];
                if(v1[0]==v2[0] || v1[1]==v1[1]){
                    count+=dsu.union(i,j);
                }
            }
        }
        return count;
    }
}
