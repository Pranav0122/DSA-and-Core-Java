package ArraysBasic;

public class GlobalLocalDemo {

    private static void india(){
        int a=10;//Local is more preffered over global variable in a function
        System.out.println(a);
        System.out.println(GlobalLocalDemo.a);
    }
    private static void australia(){
        System.out.println(a);
    }
    private static void england(){
        System.out.println(a);
    }
    static  int a=5;
    public static void main(String[] args) {
//        System.out.println(a);
        england();
        a=4;
        india();
        england();
    }
}
