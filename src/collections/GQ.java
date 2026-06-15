package collections;

import java.util.LinkedList;
import java.util.Queue;
public class GQ {
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();
        q.add(2);
        q.add(3);
        q.offer(4); // here add and offer both are same
        q.offer(5);
        System.out.println(q);
        System.out.println(q.poll()); // here poll and remove both are same but when
        // the array is out of bound poll wont show error instead it returns null
        System.out.println(q.remove());
        System.out.println(q);
        q.clear();
        System.out.println(q.poll());
    }
}
