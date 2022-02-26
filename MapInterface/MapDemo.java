package MapInterface;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map=new TreeMap<>();
        System.out.println(map);

        //1. put(k,v)--Insert
        map.put("India",200);
        System.out.println(map);
        map.put("India",400);
        System.out.println(map);//update value of key

//        2. get(k)--gets value corresponding to a key,if not present return null
//        It is not safe
        System.out.println(map.get("USA"));

        //containsKey(k)--true if k is present else false
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("USA"));



        ///3. get safety

        if(map.containsKey("USA"))
            System.out.println(map.get("USA"));
        else
            System.out.println("USA abhi map mein nhi hai");



        map.put("USA",100);
        map.put("NZ",50);

        System.out.println(map);// Insertion order is not preserved in hashmap

        //4. getOrDefault(k,defaultValue);
        //get safety 2
        System.out.println(map.getOrDefault("India",0));//run get because key is present
        System.out.println(map.getOrDefault("UK",0));//runs default because key is not present

        //5. putIfAbsent(k,v)
        map.putIfAbsent("India",500);//Prevents updations
        System.out.println(map.get("India"));

        //6. Size()
        System.out.println(map.size());

//        List<Integer> l=new ArrayList<>();
//        for(int e:l){
//            System.out.println(e);
//        }
//        int[] arr=new int[5];
//        for(int e:arr){
//            System.out.println(e);
//        }

        //7. keySet() to iterate over map interface keys
        System.out.println(map.keySet());//return set of keys in a map as a set
        for(String key:map.keySet()){
            System.out.print(key+" ");
        }
        System.out.println();
        for(String key:map.keySet()){
            System.out.println(key+"->"+map.get(key));//to print values corresponding to key
        }
//        Set<Integer> s=new HashSet<>();
//        for(int e:s){
//
//        }

        //8. entrySet() returns entry of map as collection
        System.out.println(map.entrySet());

        //9.Map.Entry<k,v>
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry);
            //10.getKey()
            System.out.println(entry.getKey());
            //11.getValue()
            System.out.println(entry.getValue());
        }

        //12. values()
        System.out.println(map.values());//returns values of map as a collection which can be iterable
        System.out.println(map);

    }
}
