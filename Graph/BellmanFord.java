package Graph;

import java.net.BindException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BellmanFord {
    class Edge{
        int u;
        int v;
        int wt;
        Edge(int u,int v,int wt){
            this.u=u;
            this.v=v;
            this.wt=wt;
        }
    }
    int numV;
    List<Edge> edgeList;
    BellmanFord(int numV){
        this.numV=numV;
        this.edgeList=new ArrayList<>();
    }

    private void addEdge(int u,int v,int wt){
        edgeList.add(new Edge(u,v,wt));
    }

    private void bellmanFordAlgo(int src){
        int[] dis=new int[numV];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[src]=0;
        for(int iter=1;iter<=numV-1;iter++){
            for(Edge edge:edgeList){
                //u se start v pe khatam
                if(dis[edge.u]!=Integer.MAX_VALUE && dis[edge.v]>dis[edge.u]+ edge.wt){
                    dis[edge.v]=dis[edge.u]+ edge.wt;
                }
            }
        }
            for(Edge edge:edgeList){
                //u se start v pe khatam
                if(dis[edge.u]!=Integer.MAX_VALUE && dis[edge.v]>dis[edge.u]+ edge.wt){
                    System.out.println("Kyun negativity faila raha hai");
                    break;
                }
            }
        System.out.println(Arrays.toString(dis));
    }
    public static void main(String[] args) {
        BellmanFord graph=new BellmanFord(6);

        graph.addEdge(0,1,10);
        graph.addEdge(0,2,20);
        graph.addEdge(1,3,20);
        graph.addEdge(2,4,15);
        graph.addEdge(1,4,15);
        graph.addEdge(3,5,30);
        graph.addEdge(4,5,10);
        graph.addEdge(4,0,-30);
        graph.bellmanFordAlgo(0);

    }
}
