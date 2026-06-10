package Generics.Learn;

public class Main {
    public static void main(String[] args){
        content<String> c=new content<>();
        c.setName("Arun");
        System.out.println(c.getName());
        Items<String,Double,Boolean> i=new Items("Banana",10.3,true);
        System.out.println(i.getName()+" "+i.getB()+" "+i.getD());
    }

}
