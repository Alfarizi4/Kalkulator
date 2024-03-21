/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator_alfarizi;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class CRUD {
    private Double angka1, angka2, hasil;
    private String operator;
    private Connection CRUDkoneksi;
    private PreparedStatement CRUDpsmt;
    private Statement CRUDstat;
    private ResultSet CRUDhasil;
    private String CRUDquery;
    
    public CRUD(){
        Koneksi conn = new Koneksi();
        CRUDkoneksi = conn.getKoneksi();
    }
    
    public void setAngka1(Double angka1){
        this.angka1 = angka1;
    }
    
    public Double getAngka1(){
        return angka1;
    }
    
    public void setOperator(String operator){
        this.operator = operator;
    }
    
    public String getOperator(){
        return operator;
    }
    
    public void setAngka2(Double angka2){
        this.angka2 = angka2;
    }
    
    public Double getAngka2(){
        return angka2;
    }
    
    public void setHasil(Double hasil){
        this.hasil = hasil;
    }
    
    public Double getHasil(){
        return hasil;
    }
    
    public void simpanData(Double angka1, String operator, Double angka2, Double hasil) {
        CRUDquery = "insert into kalku (angka1, operator, angka2, hasil) values (?,?,?,?)";
        try {
        CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
        CRUDpsmt.setDouble(1, angka1);
        CRUDpsmt.setString(2, operator);
        CRUDpsmt.setDouble(3, angka2);
        CRUDpsmt.setDouble(4, hasil);
        CRUDpsmt.executeUpdate();
        CRUDpsmt.close();
        }catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
