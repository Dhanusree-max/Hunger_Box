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
        //Statement st=con.createStatement();
        /*String query="select *from students;";
        PreparedStatement ps=con.prepareStatement(query);
        //String query="select *from students";
        ResultSet rs=ps.executeQuery(query);
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
        //inserting values
//        String query = "insert into Students (id, name, email, marks) values(?,?,?,?)";
//
//        PreparedStatement ps = con.prepareStatement(query);
//
//        ps.setInt(1, 1);
//        ps.setString(2, "Arun");
//        ps.setString(3, "sda");
//        ps.setInt(4, 83);
//
//        int myRes = ps.executeUpdate();
//
//        if(myRes > 0){
//            System.out.println("success");
//        }
//        else{
//            System.out.println("fail");
//        }


        //update values
//        String query = "UPDATE Students SET marks=? WHERE id=?";
//
//        PreparedStatement ps = con.prepareStatement(query);
//
//        ps.setInt(1, 95);  // new marks
//        ps.setInt(2, 1);   // id of student to update
//
//        int result = ps.executeUpdate();
//
//        if(result > 0){
//            System.out.println("Updated successfully");
//        }
//        else{
//            System.out.println("Update failed");
//        }
        String query = "DELETE FROM Students WHERE id=?";

        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, 1);  // id to delete

        int result = ps.executeUpdate();

        if(result > 0){
            System.out.println("Deleted successfully");
        }
        else{
            System.out.println("Delete failed");
        }

        /*ResultSet rs=st.executeQuery(query);
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
        /*String query=String.format("Delete from students where id=%d",2);
        int rowsFull=st.executeUpdate(query);
        if(rowsFull>0){
            System.out.println("Deleted");
        }
        else{
            System.out.println("Not Deleted");
        }*/

    }
}
