import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws Exception
    {
        String url="jdbc:mysql://localhost:3306/koli";
        String uname="root";
        String pw="koli999";
        String query="select * from HR;";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pw);
        Statement st = con.createStatement();
        ResultSet rs =st.executeQuery(query);
        rs.next();
        for(int i=0;i<=3;i++) {
            String name = rs.getString("Name")+" "+rs.getInt("Age")+" "+rs.getString("Sex");
            System.out.println(name);
            rs.next();
        }
    }
}
