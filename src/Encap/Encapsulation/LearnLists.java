package Encap.Encapsulation;
import java.util.ArrayList;
public class LearnLists {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<>();
        list.add("Policeodu");
        list.add("Euphoria");
        list.add("Frankestein");
        list.add("Raja");
        for(String s:list){
            System.out.println(s);
        }
        System.out.println(list.remove("Euphoria"));
        System.out.println(list);
        System.out.println(list.set(1,"Euphoria"));
        System.out.println(list);
        System.out.println(list.contains("Raja"));
        System.out.println(list.contains("Frankestein"));
    }
}
