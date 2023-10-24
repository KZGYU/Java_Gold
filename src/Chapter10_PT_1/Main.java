package Chapter10_PT_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "SELECT dept_code, dept_name FROM department"; 

        try {
            // データベースの指定
            String url = "jdbc:mysql://localhost:3306/golddb?verifyServerCertificate=false";
            // ドライバクラスのロード (MySQL 8以前の場合は、"com.mysql.jdbc.Driver"を使用)
            Class.forName("com.mysql.cj.jdbc.Driver");
            // データベースへの接続
            con = DriverManager.getConnection(url, "YOUR_USERNAME", "YOUR_PASSWORD");
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            // 結果の処理(省略)

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
