// It is just a damn bridge(API) it doesn’t store data itself. you need a real database behind it 


import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/abc", "root", "password");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM employee");

            while(rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getDouble("salary")
                );
            }

            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}