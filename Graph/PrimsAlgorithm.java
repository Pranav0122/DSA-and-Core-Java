package Graph;

public class PrimsAlgorithm {

    private static int primsMST(int[][] cost) {
        boolean[] vis = new boolean[cost.length];
        vis[0] = true;
        int totalCost=0;
        for (int v = 1; v < cost.length; v++) {
            int s = 0, e = 0;
            for (int r = 0; r < cost.length; r++) {
                if (vis[r]) {
                    for (int c = 0; c < cost[r].length; c++) {
                        if(!vis[c] && cost[r][c]<cost[s][e]){
                            s=r;
                            e=c;
                        }
                    }
                }
            }
            System.out.println("Chosen edge is : "+s+" "+e);
            vis[e]=true;
            totalCost+=cost[s][e];
        }
        return totalCost;
    }
    public static void main(String[] args) {
        int[][] conn={{0,3,0,2,0,0,0,0,4},
                {3,0,0,0,0,0,0,4,0},
                {0,0,0,6,0,1,0,2,0},
                {2,0,6,0,1,0,0,0,0},
                {0,0,0,1,0,0,0,0,8},
                {0,0,1,0,0,0,8,0,0},
                {0,0,0,0,0,8,0,0,0},
                {0,4,2,0,0,0,0,0,0},
                {4,0,0,0,8,0,0,0,0}
        };

        for(int r=0;r< conn.length;r++){
            for (int c=0;c<conn[r].length;c++){
                if(conn[r][c]==0)
                    conn[r][c]=Integer.MAX_VALUE;
            }
        }

//        for(int r=0;r< conn.length;r++){
//            for (int c=0;c<conn[r].length;c++){
//                System.out.println(conn[r][c]+" ");
//            }
//            System.out.println();
//        }
        System.out.println(primsMST(conn));

    }
}
