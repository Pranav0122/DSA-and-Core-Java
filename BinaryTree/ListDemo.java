package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        l1.add(10);
        l1.add(20);
        System.out.println(l1);
        ans.add(l1);
        ans.add(new ArrayList<>(l1));
        System.out.println(ans);
        l1.remove(l1.size()-1);
        System.out.println(l1);
        System.out.println(ans);
        int a=Integer.MAX_VALUE+1;
        System.out.println(a);
    }
}
