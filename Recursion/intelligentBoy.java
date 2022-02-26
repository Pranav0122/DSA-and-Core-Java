package Recursion;

public class intelligentBoy {
    private static int sol(int[] arr,int curr,int sum,int k){

        if(sum==k)
            return 1;
        if(curr==arr.length || sum>k)
            return 0;

        int inc=sol(arr,curr+1,sum+arr[curr],k);
        int exc=sol(arr,curr+1,0,k);
        return inc+exc;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(sol(arr,0,0,3));
    }
}
