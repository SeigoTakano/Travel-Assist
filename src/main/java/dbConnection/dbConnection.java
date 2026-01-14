import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

<<<<<<< HEAD
public class dbConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/travel_system?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "Ia8407Hb5w32";
=======
public class dbConnection { // クラス名とファイル名(dbConnection.java)を一致させる
    public static void main(String[] args) {
        // 設定情報はそのまま...
        String dbName = "TravelAssist"; 
        String user = "root";
        String pass = "Tk20030624&";
        String url = "jdbc:mysql://localhost:3306/" + dbName + "?serverTimezone=Japan";
>>>>>>> branch 'master' of https://github.com/SeigoTakano/Travel-Assist.git

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