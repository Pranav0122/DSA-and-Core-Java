package OOP;

public class IronManClient {
    public static void main(String[] args) {
//        IronManV1 im1=new IronManV1();
//        new IronManV1();//Anonymous Object
//        System.out.println(im1);
//        System.out.println(im1.arcReactor);
//        im1.canFly();
//
//        im1.arcReactor="vibranium";
//        System.out.println(im1.arcReactor);
//        System.out.println(im1.ai);
//        im1.setAi();//it will evaluate as im1.setAi(this)
//        //where this is refeering to current object(im1);
//        //where this is called implicitly in function
//        System.out.println(im1.ai);
//        im1.setHands(10);
//        System.out.println(im1.hands);
        IronManV1 im1=new IronManV1();
        IronManV1 im2=new IronManV1();

        im1.arcReactor="vibranium";

        System.out.println(im1.arcReactor);
        System.out.println(im2.arcReactor);
    }
}
