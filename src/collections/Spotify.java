package collections;

import java.util.*;

public class Spotify {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Queue<String> q=new LinkedList<>();
        q.add("oo antava mava");
        q.add("Bad boy");
        q.add("Kissik");
        q.add("Ippatikinka na vayassu");
        q.add("Aalaporahn");
        q.add("macho");
        q.add("singappaney");
        System.out.println(q.contains("singappaney"));
        int num=sc.nextInt();
        sc.nextLine();
        switch(num) {
            case 1:
                System.out.println("Enter the song");
                String song = sc.nextLine();
                q.add(song);
                System.out.println(q);
                break;
            case 2:
                System.out.println("song has been removed");
                q.poll();
                System.out.println(q);
                break;
            case 3:
                System.out.println(q.peek());
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
