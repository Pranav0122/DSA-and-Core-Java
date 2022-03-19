package Graph;

import java.util.*;

public class AccountsMerge {
    static class DSUUnoptimised {
        int V;
        int[] parent;

        DSUUnoptimised(int v) {
            V = v;
            parent = new int[V];
            Arrays.fill(parent, -1);
        }

        private int find(int u) {
            if (parent[u] == -1) {
                return u;
            }
            return parent[u] = find(parent[u]);
        }

        private void union(int u, int v) {
            int godFatherU = find(u);
            int godFatherV = find(v);
            if (godFatherU != godFatherV) {
                parent[godFatherU] = godFatherV;
            }
        }
    }
        public List<List<String>> accountsMerge(List<List<String>> accounts) {
        DSUUnoptimised dsu =new DSUUnoptimised(accounts.size());
        Map<String,Integer> emailImmParent=new HashMap<>();
        for(int v=0;v<accounts.size();v++){
            List<String> account=accounts.get(v);
            for(int i=1;i<account.size();i++){
                String currMail=account.get(i);
                if(!emailImmParent.containsKey(currMail)){
                    emailImmParent.put(currMail,v);
                }else{
                    dsu.union(v,emailImmParent.get(currMail));
                }
            }
        }
//            System.out.println(emailImmParent);
        Map<Integer,List<String>> emailClubbed=new HashMap<>();
        for (String email:emailImmParent.keySet()){
            int immParent=emailImmParent.get(email);
            int godFather=dsu.find(immParent);
            List<String> emails=emailClubbed.getOrDefault(godFather,new ArrayList<>());
            emails.add(email);
            Collections.sort(emails);
            emailClubbed.put(godFather,emails);
        }
            System.out.println(emailClubbed);
        List<List<String>> ans=new ArrayList<>();
        for(int v:emailClubbed.keySet()){
            String accountName=accounts.get(v).get(0);
            List<String> emails=emailClubbed.get(v);
            emails.add(0,accountName);
            ans.add(emails);
        }
        return ans;
    }
}
