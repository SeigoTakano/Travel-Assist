import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection { // クラス名とファイル名(dbConnection.java)を一致させる
    public static void main(String[] args) {
        // 設定情報はそのまま...
        String dbName = "TravelAssist"; 
        String user = "root";
        String pass = "Tk20030624&";
        String url = "jdbc:mysql://localhost:3306/" + dbName + "?serverTimezone=Japan";

        System.out.println("接続試行中...");

        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            if (conn != null) {
                System.out.println("成功！MySQLに正常に接続されました。");
            }
        } catch (SQLException e) {
            System.out.println("接続に失敗しました。");
            e.printStackTrace();
        }
    }
}