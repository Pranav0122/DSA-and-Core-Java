package Graph;

import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Graph2 {
    int v;
    Map<Integer, List<Integer>> adjList;
    public Graph2(int v){
        this.v=v;
        this.adjList=new HashMap<>();
    }
    private void addEdge(int u,int v,boolean bidir){
        List<Integer> neighnourU=adjList.getOrDefault(u,new ArrayList<>());
        neighnourU.add(v);
        adjList.put(u,neighnourU);
        if(bidir){
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

    private void bfs(int src){
        Queue<Integer> q=new LinkedList<>();
        Set<Integer> vis=new HashSet<>();
        q.add(src);
        vis.add(src);
        while (!q.isEmpty()){
            int front=q.poll();
            System.out.print(front+" ");
            List<Integer> neighbourList=adjList.getOrDefault(front,new ArrayList<>());
            for(int neighbour:neighbourList){
                if(!vis.contains(neighbour)){
                    q.add(neighbour);
                    vis.add(neighbour);
                }
            }
        }
    }

    private void sssp(int src){
        Map<Integer,Integer> dis=new HashMap<>();
        for(int v=1;v<=this.v;v++){
            dis.put(v,Integer.MAX_VALUE);
        }
        dis.put(src,0);
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        while (!q.isEmpty()){
            int front=q.poll();
            List<Integer> neighbourList=adjList.getOrDefault(front,new ArrayList<>());
            for(int neighbour:neighbourList){
                if(dis.get(neighbour)==Integer.MAX_VALUE){
                    q.add(neighbour);
                    int frontDis=dis.get(front);
                    int neighbourDis=frontDis+1;
                    dis.put(neighbour,neighbourDis);
                    System.out.println("Vertex " + neighbour + " is at a distance of " + neighbourDis + " from " + src);
                }
            }
        }
    }
    private void dfsHelper(int src){
        dfs(src,new HashSet<>());
    }
    private void dfs(int src,Set<Integer> vis){
        System.out.print(src+" ");
        vis.add(src);
        List<Integer> neighbours=adjList.getOrDefault(src,new ArrayList<>());
        for(int neighbour:neighbours){
            if(!vis.contains(neighbour)){
                dfs(neighbour,vis);
            }
        }
    }
    public static void main(String[] args) {
        Graph2 graph2=new Graph2(7);
        graph2.addEdge(0,1,true);
        graph2.addEdge(0,3,true);
        graph2.addEdge(0,8,true);
        graph2.addEdge(1,7,true);
        graph2.addEdge(2,3,true);
        graph2.addEdge(2,5,true);
        graph2.addEdge(2,7,true);
        graph2.addEdge(3,4,true);
        graph2.addEdge(4,8,true);
        graph2.addEdge(5,6,true);
//        graph2.display();
//       graph2.bfs(1);
//        graph2.sssp(4);
        graph2.dfsHelper(0);
    }
}
