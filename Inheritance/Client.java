package Inheritance;

public class Client {
    public static void main(String[] args) {
        //Ref -> Parent class, obj -> Parent class
        IronManV1 im1=new IronManV1();
        im1.canFly();
        //Ref -> child class, obj -> Child class
        IronManV2 im2=new IronManV2();
        im2.canFly();
        im2.unibeam();
        //object runtime pr banta hai
        IronManV1 im3=new IronManV2();//In this only override function will be called...
        //Hamesha override wala hi call hoga agar override nhi hai to present ka call hoga
        im3.missiles();

//        im3.unibean(); //compiler ke liye l.h.s. is v1, or v1 mein unibeam hai hi ni


    }
}

