package Vaisehi;

import java.util.*;

public class Person {

    public Person(){
        this(11);
        System.out.println("Inside defautl constructor");
    }
    public Person(int a){
        System.out.println("Inside paramaterized constructor");
    }
    {
        System.out.println("Inside intializer block");
    }
    public static void main(String[] args) {
//    String[] numbers={"911","91"};
//        int n=numbers.length;
//        for(int i=0;i<n;i++){
//            int size=numbers[i].length();
//            for(int j=i+1;j<n;j++){
//                if(size<=numbers[j].length())
//                    if(numbers[i].equals(numbers[j].substring(0,size)))
//                        System.out.println("true");
//                    else
//                    if(numbers[j].equals(numbers[i].substring(0,numbers[j].length())))
//                        System.out.println("true");
//            }
////        }
//        Person ps=new Person();

        Set<List<Integer>> set=new HashSet<>();
        List<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        set.add(l1);
        List<Integer> l2=new ArrayList<>();
        l2.add(3);
        l2.add(4);
        set.add(l2);
        System.out.println(set);
        Set<int[]> set1=new HashSet<>();
        int[] a={1,2};
        int[] a1={1,2};
        set1.add(a);
        set1.add(a1);
        System.out.println(set1);
    }
}
