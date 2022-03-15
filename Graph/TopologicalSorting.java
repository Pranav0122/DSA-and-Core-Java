package Graph;

import java.util.*;

public class TopologicalSorting {
    int V;
    Map<Integer,List<Integer>> adjList;
    TopologicalSorting(int v){
        V=v;
        adjList=new HashMap<>();
    }
    private void addEdge(int u,int v,boolean directed){
        if(u==v)
            return;
        List<Integer> neighbourU=adjList.getOrDefault(u,new ArrayList<>());
        neighbourU.add(v);
        adjList.put(u,neighbourU);
        if(!directed){
            List<Integer> neighbourV=adjList.getOrDefault(v,new ArrayList<>());
            neighbourV.add(u);
            adjList.put(v,neighbourV);
        }
    }
    private void display(){
        for(int vertex:adjList.keySet()){
            System.out.println(vertex+"->"+adjList.get(vertex));
        }
    }

    private int[] inDegree(){
        int[] indegree=new int[V];
        for(int i=0;i<V;i++){
            List<Integer> neighbourList=adjList.getOrDefault(i,new ArrayList<>());
            for(int neighbour:neighbourList){
                indegree[neighbour]++;
            }
        }
        return indegree;
    }
    public void topologicalSorting(){
        int[] indegree=inDegree();
        Queue<Integer> bfs=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0)
                bfs.add(i);
        }
        while (!bfs.isEmpty()){
            int front =bfs.poll();
            System.out.print(front+" ");
            List<Integer> neighboursList=adjList.getOrDefault(front,new ArrayList<>());
            for(int neighbour:neighboursList){
                indegree[neighbour]--;
                if(indegree[neighbour]==0){
                    bfs.add(neighbour);
                }
            }
        }
    }

    private boolean cycleDetectionTopologicalSorting(){
        int[] indegree=inDegree();
        Queue<Integer> bfs=new LinkedList<>();
        for(int v=0;v<V;v++){
            if(indegree[v]==0){
                bfs.add(v);
            }
        }
        int count=0;
        while (!bfs.isEmpty()){
            int front=bfs.poll();
            System.out.print(front+" ");
            count++;
            List<Integer> neighnbourList=adjList.getOrDefault(front,new ArrayList<>());
            for (int neighbour:neighnbourList){
                indegree[neighbour]--;
                if(indegree[neighbour]==0)
                    bfs.add(neighbour);
            }
        }
        return count!=V;
    }

    public static void main(String[] args) {
        TopologicalSorting g=new TopologicalSorting(8);
        g.addEdge(0,1,true);
        g.addEdge(0,2,true);
        g.addEdge(2,3,true);
        g.addEdge(2,4,true);
        g.addEdge(3,1,true);
        g.addEdge(5,3,true);
        g.addEdge(5,6,true);
        g.addEdge(4,6,true);
        g.addEdge(7,6,true);
        g.addEdge(7,7,true);
//        g.addEdge(7,4,true);
        g.display();
        System.out.println("=====================");
//        g.topologicalSorting();
        System.out.println(g.cycleDetectionTopologicalSorting());
    }
}