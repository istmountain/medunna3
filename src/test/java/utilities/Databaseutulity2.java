package utilities;

import java.sql.*;
import java.util.List;

import static utilities.DatabaseUtility.getColumnData;

public class Databaseutulity2 {
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void createConnection(String url, String user, String password) {
        try {
            connection =  DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

 createConnection("jdbc:postgresql://medunna.com:5432/medunna_db","medunna_user","medunna_pass_987");


    }

}