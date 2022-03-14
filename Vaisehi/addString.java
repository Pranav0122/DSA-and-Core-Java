package Vaisehi;

public class addString {
    public static void main(String[] args) {
        int n=4;
        String x="abcd";
        String y="abab";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            int a=x.charAt(i);
            int b=y.charAt(i);
            a-=97;
            b-=97;
            a=(a+b)%26+97;
            char ch=(char)a;
            sb.append(ch);
        }
        String str=sb.toString();
        System.out.println(str);
//        System.out.println(sb.toString());
//        System.out.println(s);
//        System.out.println(b);
//        System.out.println(s);
    }
}
