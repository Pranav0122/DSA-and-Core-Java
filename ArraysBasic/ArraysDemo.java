package ArraysBasic;

import OOP.IronManV1;

public class ArraysDemo {
    private static void colorChange(char[] myHouse,int ci){
        if(ci==myHouse.length){
            return;
        }
        myHouse[ci]='G';
        colorChange(myHouse,ci+1);
        myHouse[ci]='B';
    }
    public static void main(String[] args) {
//        int[] arr=new int[5];
//        System.out.println(arr);//Print Address
        String str="Pranav";
        char[] myHouse={'B','B','B'};
        colorChange(myHouse,0);
        for (char color: myHouse)
            System.out.print(color+" ");
//        IronManV1 im1=new IronManV1();   //Object calling from another package
//        System.out.println(im1.arcReactor);
    }
}
