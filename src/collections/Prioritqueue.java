package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Prioritqueue {
    public static void main(String[] args){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        //PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(67);
        pq.add(77);
        pq.add(10);
        pq.add(12);
        pq.add(47);
        pq.add(56);
        System.out.println(pq);
    }
}
