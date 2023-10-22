package com.fbapp.facebookclone;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class ConnectionUtil {

    public Connection conn(String dbname, String user, String pass){

        Connection conn = null;
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5433/postgres?currentSchema=jdbcfirst" + dbname, user, pass);
            if (conn != null){
                System.out.println("Connection Established");
            } else{
                System.out.println("Connection Failed");
            }
        } catch(Exception e){
            System.out.println(e);
        }

        return conn;
    }

}
