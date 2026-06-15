package FileHandling;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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

        System.out.println("Starting my file");
        String path="C:\\Users\\dhanu\\IdeaProjects\\Profit\\src\\FileHandling\\test.txt";
        File f=new File(path);
        FileWriter fw=new FileWriter(f,true);
        BufferedWriter bw=new BufferedWriter(fw);
        //fw.write("Hello");
        bw.write(" HELLO AM ARUN");
        bw.close();
        fw.close();

    }
}
