package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataTransferInput {
    public DataTransferInput(String name, int score){
        String url="jdbc:mysql://localhost:3306/quiz";
        String user="root";
        String password="qaz123@QAZ";
        String query="insert into quiz_score(Name,score) values('"+name+"','"+score+"')";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(url,user,password);
            Statement s=connection.createStatement();
            s.executeUpdate(query);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
