/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smsgateway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection mysqlkonek;
    public Connection Connect() throws ClassNotFoundException{
        try {
            String url="jdbc:mysql://localhost:3306/pjar"; //url database
            String user="root"; //user database
            String pass=""; //password database
            Class.forName("com.mysql.jdbc.Driver");
            mysqlkonek = DriverManager.getConnection(url,user,pass);        
            return mysqlkonek;
        } catch (SQLException e) {
            System.err.println("Koneksi Gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return mysqlkonek;
    }        
}
