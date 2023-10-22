package com.fbapp.facebookclone;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class PostgreSQLJDBC {
    public static void main(String args[]) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5433/Fbclone",
                            "postgres", "akanksha8080");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            //RUN THE FOLLOWING ONE BY ONE BY REMOVING COMMENT FROM EACH//

//CREATE TABLE//

          /*  stmt = c.createStatement();
            String sql = "CREATE TABLE FBUSER " +
                    "(USERID INT PRIMARY KEY     NOT NULL," +
                    " USERNAME           TEXT    NOT NULL, " +
                    " PASSWORD            INT     NOT NULL, " +
                    " EMAILID        CHAR(50))";

            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Table created successfully");

// INSERT VALUES INTO TABLE//

            stmt = c.createStatement();
            String sql = "INSERT INTO FBUSER (USERID,USERNAME,PASSWORD,EMAILID) "
                    + "VALUES (201, 'Akanksha', 8989,'ingoleak15@gmail.com'  );";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO FBUSER (USERID,USERNAME,PASSWORD,EMAILID) "
                    + "VALUES (202, 'Anushka', 2576, 'anu05@gmail.com');";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO FBUSER (USERID,USERNAME,PASSWORD,EMAILID) "
                    + "VALUES (303, 'Angel', 2343, 'annie345@gmail.com');";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO FBUSER (USERID,USERNAME,PASSWORD,EMAILID) "
                    + "VALUES (404, 'Triveni', 2567, 'tiir678@gmail.com');";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }
}*/

            //READ FROM TABLE//

   /*         stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM FBUSER;" );
            while ( rs.next() ) {
                int userid = rs.getInt("userid");
                String  username = rs.getString("username");
                int password  = rs.getInt("password");
                String  emailid = rs.getString("emailid");

                System.out.println( "USERID = " + userid );
                System.out.println( "USERNAME = " + username );
                System.out.println( "PASSWORD = " + password );
                System.out.println( "EMAILID = " + emailid );

                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
}*/

            //UPDATE TABLE//

       /*     stmt = c.createStatement();
            String sql = "UPDATE FBUSER set PASSWORD = 8098 where USERID=104;";
            stmt.executeUpdate(sql);
            c.commit();

            ResultSet rs = stmt.executeQuery( "SELECT * FROM FBUSER ;" );
            while ( rs.next() ) {
                int userid = rs.getInt("userid");
                String  username = rs.getString("username");
                int password  = rs.getInt("password");
                String  emailid = rs.getString("emailid");

                System.out.println( "USERID = " + userid );
                System.out.println( "USERNAME = " + username );
                System.out.println( "PASSWORD = " + password );
                System.out.println( "EMAILID = " + emailid );

                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
        System.out.println("UPDATE done successfully");
    }

*/
    //DELETE FROM TABLE//

           stmt = c.createStatement();
            String sql = "DELETE FROM FBUSER WHERE USERID = 303 ;";
            stmt.executeUpdate(sql);
            c.commit();

            ResultSet rs = stmt.executeQuery( "SELECT * FROM FBUSER ;" );
            while ( rs.next() ) {
                int userid = rs.getInt("userid");
                String  username = rs.getString("username");
                int password  = rs.getInt("password");
                String  emailid = rs.getString("emailid");

                System.out.println( "USERID = " + userid );
                System.out.println( "USERNAME = " + username );
                System.out.println( "PASSWORD = " + password );
                System.out.println( "EMAILID = " + emailid );

                System.out.println();
            }
            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
        System.out.println("DELETE done successfully");
    }
}