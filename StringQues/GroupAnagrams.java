package StringQues;

import java.util.*;

public class GroupAnagrams {

    //Using Count sort with toString method with StringBuilder
    private static List<List<String>> anagrams(String[] str){
        Map<String,List<String>> map=new HashMap<>();
        for(String st:str){
            int[] freq=new int[26];
            for(int i=0;i<st.length();i++){
                char ch=st.charAt(i);
                int index=ch-'a';
                freq[index]++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<26;i++){
                sb.append(freq[i]);
                sb.append(',');
            }
            String s=new String(sb);
            List<String> list=map.getOrDefault(s,new ArrayList<>());
            list.add(st);
            map.put(s,list);
        }
        List<List<String>> retList=new ArrayList<>();
        retList.addAll(map.values());
        return retList;
    }

    //Using Count sort with toString method without StringBuilder
//    private static List<List<String>> anagrams(String[] str){
//        Map<String,List<String>> map=new HashMap<>();
//        for(String st:str){
//            int[] freq=new int[26];
//            for(int i=0;i<st.length();i++){
//                char ch=st.charAt(i);
//                int index=ch-'a';
//                freq[index]++;
//            }
//            String s=Arrays.toString(freq);
//            List<String> list=map.getOrDefault(s,new ArrayList<>());
//            list.add(st);
//            map.put(s,list);
//        }
//        List<List<String>> retList=new ArrayList<>();
//        retList.addAll(map.values());
//        return retList;
//    }


    //Through Hashing using getOrDefault
//    private static List<List<String>> anagrams(String[] str){
//        Map<String,List<String>> map=new HashMap<>();
//        for(String st:str) {
//            char[] s = st.toCharArray();
//            Arrays.sort(s);
//            String sortStr = new String(s);
//            List<String> list = map.getOrDefault(sortStr, new ArrayList<>());
//            list.add(st);
//            map.put(sortStr, list);
//        }
//        System.out.println(map.values());
//        List<List<String>> retList=new ArrayList<>();
//        retList.addAll(map.values());
//        return retList;
//    }

    //Through Hashing using containsKey
//    private static List<List<String >> anagrams(String[] str){
//        Map<String,List<String>> map=new HashMap<>();
//        for(String st:str){
//            char[] s=st.toCharArray();
//            Arrays.sort(s);
//            String sortStr=new String(s);
//            if(map.containsKey(sortStr)){
//                List<String> list=map.get(sortStr);
//                list.add(st);
//                map.put(sortStr,list);
//            }
//            else {
//                List<String> list = new ArrayList<>();
//                list.add(st);
//                map.put(sortStr, list);
//            }
//        }
//        System.out.println(map.values());
//        List<List<String>> retList=new ArrayList<>();
//        retList.addAll(map.values());
//        return retList;
//    }
    public static void main(String[] args) {
        String[] str={"eat","tea","tan","ate","nat","bat"};
        System.out.println(anagrams(str));
    }
}
