package ArraysBasic;

public class ChangesInHeap {
    private static void change(char[] a){
        a[0]='G';
    }
    public static void main(String[] args) {
        char[] a={'B','B','B'};
        System.out.println(a[0]);
        change(a);
        System.out.println(a[0]);
    }
}
