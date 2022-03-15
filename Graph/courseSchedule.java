package Graph;

import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class courseSchedule {
    static class Graph {
        int V;
        Map<Integer, List<Integer>> adjList;

        Graph(int v) {
            V = v;
            adjList = new HashMap<>();
        }

        private void addEdge(int u, int v, boolean directed) {
            if (u == v)
                return;
            List<Integer> neighbourU = adjList.getOrDefault(u, new ArrayList<>());
            neighbourU.add(v);
            adjList.put(u, neighbourU);
            if (!directed) {
                List<Integer> neighbourV = adjList.getOrDefault(v, new ArrayList<>());
                neighbourV.add(u);
                adjList.put(v, neighbourV);
            }
        }

        private void display() {
            for (int vertex : adjList.keySet()) {
                System.out.println(vertex + "->" + adjList.get(vertex));
            }
        }

        private int[] inDegree() {
            int[] indegree = new int[V];
            for (int i = 0; i < V; i++) {
                List<Integer> neighbourList = adjList.getOrDefault(i, new ArrayList<>());
                for (int neighbour : neighbourList) {
                    indegree[neighbour]++;
                }
            }
            return indegree;
        }

//        public void topologicalSorting() {
//            int[] indegree = inDegree();
//            Queue<Integer> bfs = new LinkedList<>();
//            for (int i = 0; i < V; i++) {
//                if (indegree[i] == 0)
//                    bfs.add(i);
//            }
//            while (!bfs.isEmpty()) {
//                int front = bfs.poll();
//                System.out.print(front + " ");
//                List<Integer> neighboursList = adjList.getOrDefault(front, new ArrayList<>());
//                for (int neighbour : neighboursList) {
//                    indegree[neighbour]--;
//                    if (indegree[neighbour] == 0) {
//                        bfs.add(neighbour);
//                    }
//                }
//            }
//        }

        private boolean canFinish() {
            int[] indegree = inDegree();
            Queue<Integer> bfs = new LinkedList<>();
            for (int v = 0; v < V; v++) {
                if (indegree[v] == 0) {
                    bfs.add(v);
                }
            }
            int count = 0;
            while (!bfs.isEmpty()) {
                int front = bfs.poll();
                System.out.print(front + " ");
                count++;
                List<Integer> neighnbourList = adjList.getOrDefault(front, new ArrayList<>());
                for (int neighbour : neighnbourList) {
                    indegree[neighbour]--;
                    if (indegree[neighbour] == 0)
                        bfs.add(neighbour);
                }
            }
            return count == V;
        }
    }
    public static void main(String[] args) {
        int numCourses= 4;
        int[][]pre={{2,0},{2,1},{3,2}};
        Graph g=new Graph(numCourses);
        for(int i=0;i<pre.length;i++){
            g.addEdge(pre[i][1],pre[i][0],true);
        }
        g.display();
        System.out.println(g.canFinish());
    }
}
