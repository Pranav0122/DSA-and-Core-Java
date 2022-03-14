package Graph;

import java.util.*;

public class GraphTCS {
    int v;
    Map<Integer, List<Integer>> adjList;
    public GraphTCS(int v){
        this.v=v;
        this.adjList=new HashMap<>();
    }
    private void addEdge(int u,int v) {
        List<Integer> neighnourU = adjList.getOrDefault(u, new ArrayList<>());
        neighnourU.add(v);
        adjList.put(u, neighnourU);
    }

    private int sssp(int src,int end){
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
            for(int neighbour:neighbourList) {
                if (dis.get(neighbour) == Integer.MAX_VALUE) {
                    q.add(neighbour);
                    int frontDis = dis.get(front);
                    int neighbourDis = frontDis + 1;
                    dis.put(neighbour, neighbourDis);
                    if (neighbour == end)
                        return neighbourDis;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        GraphTCS graph=new GraphTCS(n);
        for(int i=1;i<=n;i++){
            String a=sc.nextLine();
            String[] b=a.split(" ");
            for(int j=0;j<b.length;j++){
                int num=Integer.parseInt(b[j]);
                graph.addEdge(i,num);
            }
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(graph.sssp(a,b));


    }
}
