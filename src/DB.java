import java.sql.*;

public class DB {
    String cS = "jdbc:sqlite:sqlite_deneme.db";
    
    Connection conn;
    
    public DB() throws Exception
    {     
        Class.forName("org.sqlite.JDBC");

        conn = DriverManager.getConnection(cS);
        
        Statement sorguMüsteri = conn.createStatement();
        
        String sqlMüsteri = "CREATE TABLE IF NOT EXISTS Müsteriler"
                + "("
                + "id integer primary key,"
                + "tc text,"
                + "ad text,"
                + "soyad text,"
                + "email text,"
                + "telefon text,"
                + "adres text,"
                + "kayitTarihi text"  
                + ");";
     
        sorguMüsteri.execute(sqlMüsteri);
        
        Statement sorguArizaDurum = conn.createStatement();
        
        String sqlArizaDurum = "CREATE TABLE IF NOT EXISTS ArizaDurum"
                + "("
                + "id integer primary key,"
                + "tc text,"
                + "ad text,"
                + "sikayet text,"
                + "sikayetTarih text,"
                + "cMarka text,"
                + "cModel text,"
                + "seriNo text,"
                + "müsteriOnayi text" 
                + ");";
        
        sorguArizaDurum.execute(sqlArizaDurum);
        
        Statement teknikServis = conn.createStatement();
        String sqlTeknikServis = "CREATE TABLE IF NOT EXISTS TeknikServis"
                + "("
                + "id integer primary key,"
                + "tc text,"
                + "sikayet text,"
                + "garantiDurumu text,"
                + "önInceleme text,"
                + "tamirSüresi text,"
                + "teslimTarihi text,"
                + "maliyet text" 
                + ");";
        teknikServis.execute(sqlTeknikServis);
    }
    
    // Hic Sonuc Dondurmeyen Insert ,Delete, Update Sorgulari Icin
    public void qWNR(String sql) throws Exception
    {
        // Veritaban� Uzerinde Calisacak Bir Sorgu Olustur
        Statement sorgu = conn.createStatement();
        // Gonderilen SQL Kodunu Sonuc Almayacak Sekilde
        // Calistir
        sorgu.execute(sql);
    }
    
    // Select Sonucu Alan Sorgular
    public ResultSet qWMR(String sql) throws Exception
    {
        Statement sorguMüsteri = conn.createStatement();
        ResultSet rs = sorguMüsteri.executeQuery(sql);
        return rs;
    }
    
     public ResultSet getKayitlar()
    {
        ResultSet rs = null;
        try
        {
            rs = conn.createStatement().executeQuery("select * from Müsteriler");
        } catch (Exception e) { e.printStackTrace(); }
        return rs;
    }
     
      public ResultSet getArizalar()
    {
        ResultSet rs = null;
        try
        {
            rs = conn.createStatement().executeQuery("select * from ArizaDurum");
        } catch (Exception e) { e.printStackTrace(); }
        return rs;
    }
      
      public ResultSet getTeknikServis()
    {
        ResultSet rs = null;
        try
        {
            rs = conn.createStatement().executeQuery("select * from TeknikServis");
        } catch (Exception e) { e.printStackTrace(); }
        return rs;
    }
}
