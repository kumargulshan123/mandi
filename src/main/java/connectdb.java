
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gulshankumar
 */

public class connectdb {
    private static Connection c = null;
public static Connection getConn() throws Exception {
    if(c == null){
    Class.forName("org.sqlite.JDBC");
    c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\IT\\Documents\\NetBeansProjects\\mavenproject2\\pungrain.db");
    }
    return c;
    }

    
}
