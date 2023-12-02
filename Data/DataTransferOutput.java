package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataTransferOutput {
    public ResultSet r;
    public DataTransferOutput() throws Exception {
        String url="jdbc:mysql://localhost:3306/quiz";
        String user="root";
        String password="qaz123@QAZ";
        String query="SELECT * FROM `quiz`.`Quiz_score` WHERE score<=100 ORDER BY score DESC limit 10";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection(url,user,password);
            Statement s=connection.createStatement();
            this.r= s.executeQuery(query);
        }catch (Exception e){
            throw new Exception("Error");
        }
    }
}
