package Vaisehi;
class A{
    public A(){
        System.out.println("A");
    }
    public A(int a){
        System.out.println(a);
    }
}
class B extends A{
    public B(){
        this(10);
        System.out.println("B");
    }
    public B(int b){
//        this();
        System.out.println(b);
    }
}
public class constructorChaining {
    public static void main(String[] args) {
        B obj=new B(20);
    }
}
