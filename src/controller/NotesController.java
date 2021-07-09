/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import connector.Connector;
import model.Notes;

/**
 *
 * @author User
 */
public class NotesController {
    
    public NotesController(){
        
        
    }
    
    public void save(String judul,String desc,String tgl,int poin){
        
        Connector connector = new Connector();
        //coba melakukan CRUD ke database
        try {
            
            String query = "INSERT INTO notes (`tanggal`, `judul`, `desc` ,`prioritas`) VALUES ('"+tgl+"','"+judul+"','"+desc+"','"+poin+"')";
            
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query);

            System.out.println("Insert Berhasil");
            
        } catch (java.sql.SQLException e){
            System.out.println(e.getMessage());
        }
        //Notes notes = new Notes();
        //notes.store(judul,desc,tgl);
    }
    
    public void delete(String judul){
        Connector connector = new Connector();
        //coba melakukan CRUD ke database
        try {
            System.out.println(judul);
            String query = "DELETE FROM notes WHERE `judul` ='"+judul+"' ";
            
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query);

            System.out.println("Hapus Berhasil");
            
        } catch (java.sql.SQLException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public void update(String judul_old,String judul,String desc,String tgl,int poin){
         Connector connector = new Connector();
        //coba melakukan CRUD ke database
        try {
            System.out.println(judul_old);
            System.out.println(judul);
            System.out.println(desc);
            System.out.println(tgl);
            String query = "UPDATE notes set `judul`='"+judul+"',`desc`='"+desc+"',`tanggal`='"+tgl+"', `prioritas`='"+poin+"' WHERE `judul` = '"+judul_old+"' ";
            
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query);

            System.out.println("Update Berhasil");
            
        } catch (java.sql.SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
