package Graph;

import javax.sound.sampled.Line;
import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;

public class Graph2 {
    int V;
    Map<Integer,List<Integer>> adjList;
    Graph2(int v){
        V=v;
        adjList=new HashMap<>();
    }
    private void addEdge(int u,int v,boolean directed){
        List<Integer> neighbourU=adjList.getOrDefault(u,new ArrayList<>());
        neighbourU.add(v);
        adjList.put(u,neighbourU);
        if(directed==true){
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


    private void dfsHelper(int src){
        dfs(src,new HashSet<>());
    }
    private void dfs(int src,Set<Integer> vis){
        System.out.print(src+" ");
        vis.add(src);
        List<Integer> neighboursList=adjList.getOrDefault(src,new ArrayList<>());
        for(int neighbour:neighboursList){
            if(!vis.contains(neighbour)){
                dfs(neighbour,vis);
            }
        }
    }
    private void bfs(int src,Set<Integer> vis){
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        vis.add(src);
        while (!q.isEmpty()){
            int front=q.poll();
            System.out.print(front+" ");
            List<Integer> neighboursList=adjList.getOrDefault(front,new ArrayList<>());
            for(int neighbour:neighboursList){
                if(!vis.contains(neighbour)){
                    q.add(neighbour);
                    vis.add(neighbour);
                }
            }
        }
    }
    private void connectedComponentsDFS(){
        Set<Integer> vis=new HashSet<>();
        int count=0;
        for(int i=1;i<=V;i++){
            if(!vis.contains(i)){
                dfs(i,vis);
                count++;
                System.out.println();
            }
        }
        System.out.println("Total number of Connected Components are:- "+count);
    }


    private void connectedComponentsBFS(){
        Set<Integer> vis=new HashSet<>();
        int count=0;
        for(int i=1;i<=V;i++){
            if(!vis.contains(i)){
                dfs(i,vis);
                count++;
                System.out.println();
            }
        }
        System.out.println("Total number of Connected Components are:- "+count);
    }


    public static void main(String[] args) {
        Graph2 graph2=new Graph2(10);
        graph2.addEdge(1, 2, true);// undirected(bidir) edge
        graph2.addEdge(1, 3, true);
        graph2.addEdge(2, 4, true);
        graph2.addEdge(3, 4, true);
        graph2.addEdge(3, 5, true);
        graph2.addEdge(5, 6, true);
        graph2.addEdge(7, 8, true);
        graph2.addEdge(9, 10, true);

//        graph2.connectedComponentsDFS();
        graph2.connectedComponentsBFS();
//                graph2.display();
        //        graph2.addEdge(0,1,true);
        //        graph2.addEdge(0,3,true);
        //        graph2.addEdge(0,8,true);
        //        graph2.addEdge(1,7,true);
        //        graph2.addEdge(2,3,true);
        //        graph2.addEdge(2,5,true);
        //        graph2.addEdge(2,7,true);
        //        graph2.addEdge(3,4,true);
        //        graph2.addEdge(4,8,true);
        //        graph2.addEdge(5,6,true);
        //        graph2.display();
//               graph2.dfsHelper(1);
        //        graph2.sssp(4);
        //        graph2.dfsHelper(0);
    }
}
