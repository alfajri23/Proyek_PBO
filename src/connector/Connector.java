/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class Connector {
    //Ini adalah databse
    String DBurl = "jdbc:mysql://localhost/TodoNotes";
    String DBusername = "root";
    String DBpassword = "";
    
    public Connection koneksi;
    public Statement statement;
    public ResultSet resultSet;
    
    //contructor databse
    public Connector() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = (Connection) DriverManager.getConnection(DBurl,"root","");
            System.out.println("Koneksi Berhasil");
        }
        catch(ClassNotFoundException | SQLException ex){
            System.out.println("Koneksi gagal");
        }
    }
    
}
