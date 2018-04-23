import java.sql.*;

public class Connecter {
    public ResultSet result = null;
    public Statement statement;
    public Connection connect;

    public Connecter() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "root");
            statement = connect.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Connecter(String url, String name, String login, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            try {
                connect = DriverManager.getConnection(url + "/" + name, login, password);
                statement = connect.createStatement();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ResultSet getResult(String query) throws SQLException {
        result = this.statement.executeQuery(query);
        return result;
    }

    public void closeconnect() {
        try {
            connect.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
