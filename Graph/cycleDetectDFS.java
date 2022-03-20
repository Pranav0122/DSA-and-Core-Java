package Graph;

import java.util.*;

public class cycleDetectDFS {
    int V;
    Map<Integer, List<Integer>> adjList;
    cycleDetectDFS(int v){
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

    private void display(){
        for(int vertex:adjList.keySet()){
            System.out.println(vertex+"->"+adjList.get(vertex));
        }
    }

    private boolean cycleDetectDFS(int src, int parent, Set<Integer> vis){
        vis.add(src);
        boolean hasCycle=false;
        for(int neighbour:adjList.getOrDefault(src,new ArrayList<>())){
            if(!vis.contains(neighbour)){
                hasCycle=cycleDetectDFS(neighbour,src,vis);
                if(hasCycle)
                    return hasCycle;
            }else if(neighbour!=parent)
                return true;
        }
        return false;
    }


    private boolean hasCycle(int src){
        Set<Integer> vis=new HashSet<>();
        return cycleDetectDFS(src,src,vis);
    }
    public static void main(String[] args) {
        cycleDetectDFS g=new cycleDetectDFS(5);
        g.addEdge(1,2,true);
        g.addEdge(2,3,true);
        g.addEdge(2,5,true);
        g.addEdge(3,5,true);
        g.addEdge(3,4,true);
        System.out.println(g.hasCycle(1));
    }
}
