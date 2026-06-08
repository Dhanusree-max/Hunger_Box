package Encap.Encapsulation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

public class CollectionFrameworks {
    public static void main(String[] args){
        LinkedHashSet<String> ls=new LinkedHashSet<>();
        HashSet<String> hs=new HashSet<>();
        HashMap<String,Integer> map=new HashMap<>();
        map.put("H1",1);
        map.put("H2",2);
        map.put("H3",3);
        map.put("H4",1);

        // here in the hashmap syntax first we get key value(in this it is String) and that
        //should be unique and the next is value i.e;integer that can be duplicate
        for(String s:map.keySet()) {
            System.out.println(s + " : " + map.get(s));
        }
            for(Map.Entry<String,Integer> entry :map.entrySet()){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        hs.add("ARun");
        hs.add("Rajesh");
        hs.add("Cell");
        hs.add("Dumber");
        hs.add("Harsh");
        hs.add("ARun");


        ls.add("ARun");
        ls.add("Rajesh");
        ls.add("Cell");
        ls.add("Dumber");
        ls.add("Harsh");
        ls.add("ARun");

        System.out.println(ls);
        System.out.println(hs);
        hs.remove("ARun");
        System.out.println(hs);
        System.out.println(hs.contains("ARun"));
    }
}
