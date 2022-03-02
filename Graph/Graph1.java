package Graph;

import java.util.*;

public class Graph1 {
    int v;
    Map<Integer, List<Integer>> adjList;
    public Graph1(int v){
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

    public static void main(String[] args) {
       Graph1 graph=new Graph1(7);
       graph.addEdge(1,2,true);
       graph.addEdge(1,3,true);
       graph.addEdge(2,4,true);
       graph.addEdge(3,4,true);
       graph.addEdge(3,5,true);
       graph.addEdge(5,6,true);
       graph.addEdge(6,7,false);
       graph.display();
//       graph.bfs(1);
       graph.sssp(4);
    }
}
