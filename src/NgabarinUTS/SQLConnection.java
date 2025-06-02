/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NgabarinUTS;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Svin
 */
public class SQLConnection {
    Connection con;
    public SQLConnection(){
        String id, pass, driver, url;
        id = "root";
        pass = "";
        driver = "com.mysql.cj.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/ngabarin";
        
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, id, pass);
            if (con == null) {
                System.out.println("Koneksi gagal");
                return;
            }
            System.out.println("Koneksi berhasil");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args){
        SQLConnection k = new SQLConnection();
    }
}
