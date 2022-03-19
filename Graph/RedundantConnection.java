package Graph;

import java.util.Arrays;

public class RedundantConnection {
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

        private void union(int u, int v) {
            int godFatherU = find(u);
            int godFatherV = find(v);
            if (godFatherU != godFatherV) {
                parent[godFatherU] = godFatherV;
            }
        }

        private int[] detectCycle(int[][] edgeList) {
            for (int r = 0; r < edgeList.length; r++) {
                int u = edgeList[r][0];
                int v = edgeList[r][1];

                int godFatherU = find(u);
                int godFatherV = find(v);

                if (godFatherU != godFatherV) {
                    union(godFatherU, godFatherV);
                } else {
                    return new int[]{u, v};
                }
            }
            return null;
        }
    }
        public int[] findRedundantConnection(int[][] edges) {
            DSUUnoptimised dsu=new DSUUnoptimised(edges.length+1);
            return dsu.detectCycle(edges);
        }
}
