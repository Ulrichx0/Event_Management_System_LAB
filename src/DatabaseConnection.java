import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    static Connection connection = null;

    public static void main(String[] args) {
        getConnection();
    }
    public static Connection getConnection() {
        if (connection!= null){
            return connection;
        }
        String host = "127.0.0.1";
        String port = "3306";
        String db_name = "eventsmanager";
        String username = "root";
        String password = "Osloselode";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + db_name + "", "" + username + "", "" + password + "");
            if (connection != null) {
                System.out.println("Connection OK");
            } else {
                System.out.println("Connection Failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}