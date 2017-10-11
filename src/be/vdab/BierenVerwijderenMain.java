package be.vdab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BierenVerwijderenMain {
    private final static String URL = "jdbc:mysql://localhost/bieren?useSSL=false";
    private static final String USER = "cursist";
    private static final String PASSWORD = "cursist";
    private static final String VERWIJDER_BIEREN = "delete from bieren where alcohol is null";
    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement()){
            System.out.println(statement.executeUpdate(VERWIJDER_BIEREN));
        }
        catch(SQLException ex){
            ex.printStackTrace();
        }
    }    
}
