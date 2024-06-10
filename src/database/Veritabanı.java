
package database;

import java.sql.*;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;


public class Veritabanı {
    
    
    private final String databaseHostIP = "localhost";
    private final String databaseName = "restoranotomasyonu";
    private final String databaseUsername = "root";
    private final String databasePassword = "";
    private int databasePort = 3306;


    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public Veritabanı(){

        String url ="jdbc:mysql://"+databaseHostIP+":"+databasePort+"/"+databaseName;

        try{
            Class.forName("com.mysql.jdbc.Driver");

        }catch (ClassNotFoundException ex ){
            System.out.println("Driver bulunamadı");
        }

        try{
            con= DriverManager.getConnection(url,databaseUsername,databasePassword);
           // System.out.println("bağlantı başarılı");
        }catch (SQLException ex){
           // System.out.println("bağlantı başarısız");

        }

    }

    public boolean loginPanel(String username, String password) {
        final var request = "Select * from hesap_bilgileri where kullanici_adi = ? and kullanici_sifresi = ?";
        try (final var statement = con.prepareStatement(request)) {
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet rs = statement.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
                
        }
    }
    
    
    public String getMemberRole(String kullaniciAdi) {
        String request = "SELECT * FROM `hesap_bilgileri` where kullanici_adi = '" + kullaniciAdi + "'";
        String kullanici_rolu = null;
        try {
            final var statement = con.createStatement();
            ResultSet rs = statement.executeQuery(request);
  
      
            while (rs.next()) {
                kullanici_rolu = rs.getString("kullanici_rolu");

            }
            return kullanici_rolu;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    
        
    
}
