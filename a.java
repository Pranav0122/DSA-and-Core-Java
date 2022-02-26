public class a {
//    static {
//        System.out.println("static");
//    }
//    {
//        System.out.println("animal1");
//    }
    public a(){

        System.out.println("animal");
    }
    static  class b{
        public b(){
            System.out.println("b");
        }
    }
    public static void main(String[] args) {
//        a ab=new a();
//        b ac=new b();
//
//        char b='c';
//        char a='a';
//        int c=(b+a)/2;
//        char ch=(char) c;
//        System.out.println(ch);
//        String str="abcdefg";
//        float f=(float) 4/(float) 3;
//        System.out.println(f);
//        String a="bsjbjhsad";
//        a="asndjs";
//        System.out.println(a.length());
        String str="abcdefg";
        String st1="abcdefg";
        st1="";
        System.out.println(st1);
        System.out.println((str==st1));
    }
}
