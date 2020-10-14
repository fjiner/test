

import java.sql.*;

/**
 * @Author: FengJin
 * @Date: 2020/10/13 17:14
 */
public class TestJDBC {

        public static void main(String[] args) {
            Connection c = null;
            Statement s = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                c=DriverManager.getConnection(
                                "jdbc:mysql://127.0.0.1:3306/dbmaster?characterEncoding=UTF-8",
                                "root", "root");
                s = c.createStatement();
//                String sql = "insert into db_user values('23','23','23')";
                String sql="select count(*) from db_user" ;
                ResultSet rs=  s.executeQuery(sql);
                int total = 0;
                while (rs.next()) {
                    total = rs.getInt(1);
                }
                System.out.println("表Hero中总共有:" + total+" 条数据");
                System.out.println("连接成功，获取连接对象： " + c);
                System.out.println("获取 Statement对象： " + s);

            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }finally {
                if (s!= null)
                    try {
                        s.close();
                        System.out.println("statement已关闭");
                    } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                // 后关闭Connection
                if (c != null)
                    try {
                        c.close();
                        System.out.println("connection已关闭");
                    } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
            }

        }
    }

