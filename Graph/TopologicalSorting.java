package Graph;

import java.util.*;

public class TopologicalSorting {
    static class Graph {

        // vertex vs list of neighbours
        int v;
        Map<Integer, List<Integer>> adjList;

        public Graph(int v) {
            // TODO Auto-generated constructor stub
            this.v = v;
            this.adjList = new HashMap<>();
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
        private void display() {

            // number of keys/vertices
            // int numVertices = adjList.size();

            for (int vertex : adjList.keySet()) {
                // vertex -> []
                System.out.println(vertex + "->" + adjList.get(vertex));
            }
        }
        private int[] indegree(){
            int[] indegree=new int[this.v];
            for(int v=0;v<this.v;v++){
                List<Integer> neighbours=adjList.getOrDefault(v,new ArrayList<>());
                for(int neighbour:neighbours){
                    indegree[neighbour]++;
                }
            }
            return indegree;
        }

        private void topologicalSorting(){
            int[] indegree = indegree();
            Queue<Integer> bfs=new LinkedList<>();
            for(int v=0;v<this.v;v++){
                if(indegree[v]==0)
                    bfs.add(v);
            }
            while(!bfs.isEmpty()){
                int front=bfs.poll();
                System.out.print(front+" ");
                List<Integer> neighbours=adjList.getOrDefault(front,new ArrayList<>());
                for(int neighbour:neighbours){
                    indegree[neighbour]--;
                    if(indegree[neighbour]==0)
                        bfs.add(neighbour);
                }
            }
        }
        private boolean cycleDetection(){
            int[] indegree = indegree();
            Queue<Integer> bfs=new LinkedList<>();
            for(int v=0;v<this.v;v++){
                if(indegree[v]==0)
                    bfs.add(v);
            }
            int count=0;
            while(!bfs.isEmpty()){
                int front=bfs.poll();
                System.out.print(front+" ");
                count++;
                List<Integer> neighbours=adjList.getOrDefault(front,new ArrayList<>());
                for(int neighbour:neighbours){
                    indegree[neighbour]--;
                    if(indegree[neighbour]==0)
                        bfs.add(neighbour);
                }
            }
            System.out.println(count);
            return count!=this.v;
        }
    }


    public static void main(String[] args) {
        Graph graph=new Graph(7);
        graph.addEdge(0,1,false);
        graph.addEdge(0,2,false);
        graph.addEdge(2,3,false);
        graph.addEdge(2,4,false);
        graph.addEdge(3,1,false);
        graph.addEdge(5,3,false);
        graph.addEdge(5,6,false);
        graph.addEdge(4,6,false);
//        graph.topologicalSorting();
        System.out.println("Is given graph is cyclic "+graph.cycleDetection());
    }
}