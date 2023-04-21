package JDBC_D1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCdemo3 {
    public static void main(String[] args) throws Exception {
        //1. 注册驱动
       // Class.forName("com.mysql.jdbc.Driver");
        //2. 获取连接
        String url = "jdbc:mysql://127.0.0.1:3306/db1?useSSL=false";
        String username = "root";
        String password = "1234";
        Connection conn = DriverManager.getConnection(url, username, password);
        //3. 定义sql
        String sql = "select * from  account";

        //4. 获取执行sql的对象 Statement
        Statement stmt = conn.createStatement();



        //5. 执行sql
        ResultSet rs=stmt.executeQuery(sql);

        //6. 处理结果
        while(rs.next()){
            int id=rs.getInt(1);
            String name=rs.getString(2);
            Double money = rs.getDouble(3);
            System.out.println(id);
            System.out.println(name);
            System.out.println(money);
            System.out.println("-----------------------------");
        }


        //7. 释放资源
        rs.close();
        stmt.close();
        conn.close();
    }
}
