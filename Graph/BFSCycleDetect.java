package Graph;

import java.util.*;

public class BFSCycleDetect {
    int V;
    Map<Integer, List<Integer>> adjList;
    BFSCycleDetect(int v){
        V=v;
        adjList=new HashMap<>();
    }
    private void addEdge(int u,int v,boolean directed){
        List<Integer> neighbourU=adjList.getOrDefault(u,new ArrayList<>());
        neighbourU.add(v);
        adjList.put(u,neighbourU);
        if(directed){
            List<Integer> neighbourV=adjList.getOrDefault(v,new ArrayList<>());
            neighbourV.add(u);
            adjList.put(v,neighbourV);
        }
    }

    private boolean cycleDetectBFS(int src){
        int[] parent=new int[V];
        for (int i=0;i<V;i++)
            parent[i]=i;
        Queue<Integer> bfs=new LinkedList<>();
        bfs.add(src);
        Set<Integer> vis=new HashSet<>();
        vis.add(src);
        while(!bfs.isEmpty()){
         int front=bfs.poll();
         for(int neighbour:adjList.getOrDefault(front,new ArrayList<>())){
             if(!vis.contains(neighbour)){
                 vis.add(neighbour);
                 bfs.add(neighbour);
                 parent[neighbour]=front;
             }else if(neighbour!=parent[front])
                 return true;
         }
        }
        return false;
    }

    private boolean isTree(int src){
        int[] parent=new int[V];
        for (int i=0;i<V;i++)
            parent[i]=i;
        Queue<Integer> bfs=new LinkedList<>();
        bfs.add(src);
        Set<Integer> vis=new HashSet<>();
        vis.add(src);
        while(!bfs.isEmpty()){
            int front=bfs.poll();
            for(int neighbour:adjList.getOrDefault(front,new ArrayList<>())){
                if(!vis.contains(neighbour)){
                    vis.add(neighbour);
                    bfs.add(neighbour);
                    parent[neighbour]=front;
                }else if(neighbour!=parent[front])
                    return false;
            }
        }
        return vis.size()==V;
    }

    private void display(){
        for(int vertex:adjList.keySet()){
            System.out.println(vertex+"->"+adjList.get(vertex));
        }
    }
    public static void main(String[] args) {
        BFSCycleDetect g=new BFSCycleDetect(7);
        g.addEdge(0,1,true);
        g.addEdge(1,2,true);
        g.addEdge(1,4,true);
//        g.addEdge(2,4,true);
        g.addEdge(2,3,true);
        g.addEdge(6,7,true);
        System.out.println(g.isTree(0));
    }
}
