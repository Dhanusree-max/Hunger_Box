package jdbc.basics;

import com.mysql.cj.jdbc.Driver;
import java.sql.*;

public class Jd {
    private static final String url="jdbc:mysql://localhost:3306/sms2";
    private static final String userName="root";
    private static final String password="Dhanu89@";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(url,userName,password);
        Statement st=con.createStatement();
        /*String query="select *from students";
        ResultSet rs=st.executeQuery(query);
        while(rs.next()){
            int id=rs.getInt("id");
            String name=rs.getString("name");
            String email=rs.getString("email");
            int marks=rs.getInt("marks");

            System.out.println(id);
            System.out.println(name);
            System.out.println(email);
            System.out.println(marks);
        }*/
        /*String query=String.format("insert into students (id,name,email,marks) values(%d,'%s','%s',%d)",2,"hema","hema@gmail.com",90);
        int myRes=st.executeUpdate(query);
        if(myRes>0){
            System.out.println("Success");
        }
        else {
            System.out.println("Fail");
        }*/

        /*String query=String.format("Update students Set marks =%d where id=%d",90,2);
        int res=st.executeUpdate(query);
        if(res>0){
            System.out.println("Success");
        }
        else{
            System.out.println("Failed");
        }*/
        String query=String.format("Delete from students where id=%d",2);
        int rowsFull=st.executeUpdate(query);
        if(rowsFull>0){
            System.out.println("Deleted");
        }
        else{
            System.out.println("Not Deleted");
        }

    }
}
