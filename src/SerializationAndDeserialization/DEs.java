package SerializationAndDeserialization;

import java.io.*;

public class DEs {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path="C:\\Users\\dhanu\\IdeaProjects\\Profit\\src\\SerializationAndDeserialization\\t1.txt";
        FileInputStream fis=new FileInputStream(path);
        ObjectInputStream ois=new ObjectInputStream(fis);
        SER s=(SER) ois.readObject();
        s.display();
        ois.close();
    }
}
