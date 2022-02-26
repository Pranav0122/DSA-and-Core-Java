package Inheritance2;

public class Benz extends Car{
    int taransmision;
    public Benz(){
        super("mercedes");//why super should be the first statement? Because parent constructor is called first.
        this.taransmision=4;
        System.out.println("Benz ka constructor");
    }

    public static void main(String[] args) {
        Benz b=new Benz();
        System.out.println(b.companyName);
     }
}
