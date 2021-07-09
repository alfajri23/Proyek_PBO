/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connector.Connector;

/**
 *
 * @author User
 */
public class Notes {
    
    public void store(String judul,String desc,String tgl){
        Connector connector = new Connector();
        //coba melakukan CRUD ke database
        try {
            
            String query = "INSERT INTO notes (`tanggal`, `judul`, `desc`) VALUES ('"+tgl+"','"+judul+"','"+desc+"')";
            
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query);

            System.out.println("Insert Berhasil");
            
        } catch (java.sql.SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
