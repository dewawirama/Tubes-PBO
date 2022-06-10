/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class koneksi {
    private static java.sql.Connection koneksi; 
    public static java.sql.Connection getkoneksi(){  
         
        if(koneksi==null){ 
            try{ 
                String url = "jdbc:mysql://localhost:3306/db_data";
                String user = "root"; 
                String password = ""; 
             
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url,user,password); 
                 
            }catch(SQLException t){ 
                System.out.println("Koneksi Gagal"); 
            } 
        } 
        return koneksi; 
    }
}
