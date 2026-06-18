package ComparableAndComparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students {
    int roll;
    String name;
    Students(int roll,String name){
        this.roll=roll;
        this.name=name;
    }


}
public class CCC {
    public static void main(String[] args){
        ArrayList<Students> list=new ArrayList<Students>();
        list.add(new Students(10,"A"));
        list.add(new Students(5,"B"));
        list.add(new Students(2,"C"));
        list.add(new Students(3,"D"));
        Comparator<Students> com=new Comparator<Students>() {
            public int compare(Students a,Students b){
                return -1;
            }
        };
        Collections.sort(list,com);
        for(Students s:list){
            System.out.println(s.name+" "+s.roll);
        }
    }
}

