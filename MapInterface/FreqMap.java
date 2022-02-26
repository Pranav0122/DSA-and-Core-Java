package MapInterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class FreqMap {
    public static void main(String[] args) {

        int[] arr={1,1,1,1000,1000,2,1000};
        Map<Integer,Integer> map=new TreeMap<>();
        for(int e:arr){
//            if(!map.containsKey(e)){
//                map.put(e,1);
//            }
//            else {
//                int value=map.get(e);//get
//                value++;//increment
//                map.put(e,value);//map update
//                //map.put(e,map.get(e)+1);
//            }
            int value=map.getOrDefault(e,0);
            value++;
            map.put(e,value);
        }
        System.out.println(map);
    }
}
