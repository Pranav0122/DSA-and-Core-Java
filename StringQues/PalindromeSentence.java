package StringQues;

public class PalindromeSentence {
    private static boolean checkPalindrome(String str){
        str=str.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                sb.append(str.charAt(i));
            }else continue;
        }
        String newString=sb.toString();
        int l=0,r=newString.length()-1;
        while(l<r){
            if(newString.charAt(l)!=newString.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="Anne, I vote more cars race Rome-to-Vienna";

        System.out.println(checkPalindrome(str));
    }
}
