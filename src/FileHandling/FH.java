package FileHandling;
import java.io.*;
import java.util.Scanner;

public class FH {
    public static void main(String[] args)throws IOException {
 /*     System.out.println("Starting my file");
        String path="C:\\Users\\dhanu\\IdeaProjects\\Profit\\src\\FileHandling\\test.txt";
        File f=new File(path);
        FileWriter fw=new FileWriter(f);
        BufferedWriter bw=new BufferedWriter(fw);

        //fw.write("Hello");
        bw.write("HELLO AM ARUN");
        bw.close();
        fw.close();*/

        /*System.out.println("Starting my file");
        String path="C:\\Users\\dhanu\\IdeaProjects\\Profit\\src\\FileHandling\\test.txt";
        File f=new File(path);
        FileWriter fw=new FileWriter(f,true);
        BufferedWriter bw=new BufferedWriter(fw);
        //fw.write("Hello");
        Scanner sc=new Scanner(System.in);
        String i=sc.nextLine();
        bw.newLine();
        bw.write(i);
        bw.close();
        fw.close();
        */
        System.out.println("Starting my file");
        String path="C:\\Users\\dhanu\\IdeaProjects\\Profit\\src\\FileHandling\\test.txt";
        File f2=new File("C:\\Users\\dhanu\\IdeaProjects\\Profit\\src\\FileHandling\\test2.txt");
        File f1=new File(path);
        FileInputStream fis1=new FileInputStream(f1);
        FileOutputStream fis2=new FileOutputStream(f2);
        int ch;
        while((ch=fis1.read())!=-1){
            System.out.print((char)ch);
            fis2.write(ch);
        }
        fis1.close();
        fis2.close();
        //System.out.print(c);
    }
}
