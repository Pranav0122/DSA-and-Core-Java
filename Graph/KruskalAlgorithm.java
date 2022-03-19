package Graph;

import java.util.*;

public class KruskalAlgorithm {
    static class EdgeList{
        class edge{
            int u;
            int v;
            int w;
            public edge(int u,int v,int w){
                this.u=u;
                this.v=v;
                this.w=w;
            }
            public String toString(){
                return "["+u+","+v+","+w+"]";
            }
        }
        int V;
        List<edge> edgeList;
        public EdgeList(int v){
            V=v;
            edgeList=new ArrayList<>();
        }
        private void addEdge(int u,int v,int w){
            edgeList.add(new edge(u,v,w));
        }
    }
    private static int find(int u,int[] parent){
        if(parent[u]==-1){
            return u;
        }
        return parent[u]=find(parent[u],parent);
    }

    private static void unionBySetSize(int u,int v,int[] parent,int[] rank){
        int godFatherU=find(u,parent);
        int godFatherV=find(v,parent);
        if(godFatherU!=godFatherV){
            if(rank[godFatherU]<rank[godFatherV]) {
                parent[godFatherU] = godFatherV;
                rank[godFatherV]+=rank[godFatherU];
            }
            else{
                parent[godFatherV] = godFatherU;
                rank[godFatherU]+=rank[godFatherV];
            }
        }
    }

    private static int kruskalAlgorithm(List<EdgeList.edge> edgeList,int[] parent,int[] rank){
        Collections.sort(edgeList, new Comparator<EdgeList.edge>() {
            @Override
            public int compare(EdgeList.edge o1, EdgeList.edge o2) {
                return o1.w-o2.w;
            }
        });
        int cost=0;
        for(EdgeList.edge currEdge:edgeList){
            int u=currEdge.u;
            int v=currEdge.v;
            int w=currEdge.w;
            int godFatherU=find(u,parent);
            int godFatherV=find(v,parent);
            if(godFatherU!=godFatherV){
                unionBySetSize(godFatherU,godFatherV,parent,rank);
                cost+=w;
            }
        }
        return cost;
    }

    public static void main(String[] args) {
//        int numV=7;
//        int[][] edgeList={{0,1},{1,2},{2,3},{3,1},{4,5},{4,6}};
//        KruskalAlgorithm dsu=new KruskalAlgorithm(numV);
//        System.out.println(dsu.detectCycle(edgeList));
        EdgeList graph=new EdgeList(5);
        graph.addEdge(0,3,2);
        graph.addEdge(0,4,12);
        graph.addEdge(3,2,2);
        graph.addEdge(4,2,7);
        graph.addEdge(3,1,6);
        graph.addEdge(1,2,1);

        int[] parent=new int[5];
        Arrays.fill(parent,-1);
        int[] rank=new int[5];
        Arrays.fill(rank,1);
        System.out.println(graph.edgeList);
        System.out.println(kruskalAlgorithm(graph.edgeList,parent,rank));
        System.out.println(graph.edgeList);
    }
}
