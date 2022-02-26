package ArraysBasic;

public class ArraysSwapDemo {
    private static void swap(int[] a,int[] b){
        System.out.println("************");
        int[] temp=a;
        a=b;
        b=temp;
        System.out.println("A ka address "+a);
        System.out.println("B ka address "+b);
        System.out.println("************");
    }
    public static void main(String[] args) {
        int[] a={5,5,5,5,5};
        int[] b={4,4,4,4};
        System.out.println("A ka address "+a);
        System.out.println("B ka address "+b);
        swap(a,b);
        System.out.println("A ka address "+a);
        System.out.println("B ka address "+b);
    }
}
