/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator_alfarizi;

import static kalkulator_alfarizi.KalkulatorForm.pembagian;
import static kalkulator_alfarizi.KalkulatorForm.pengurangan;
import static kalkulator_alfarizi.KalkulatorForm.penjumlahan;
import static kalkulator_alfarizi.KalkulatorForm.perkalian;

/**
 *
 * @author ASUS
 */
public class App {
    public static void main(String[] args) {
        KalkulatorForm kf = new KalkulatorForm();
        kf.setLocationRelativeTo (null);
        kf.setVisible(true);
    }
    
    public static Double hitung(Double angka1, Double angka2, String operator) {
        Double hasil = null;
        
        if (operator.equals("+")) {
            hasil = penjumlahan(angka1, angka2);
        }else if (operator.equals("-")) {
            hasil = pengurangan(angka1, angka2);
        }else if (operator.equals("*")) { 
            hasil = perkalian(angka1, angka2);
        }else if (operator.equals(":")) {
            hasil = pembagian(angka1, angka2);
        }
        
        return hasil;
    }
    
    public static Double penjumlahan(Double angka1, Double angka2) {
           Double hasil = angka1 + angka2;
           return hasil;
    }
    public static Double pengurangan(Double angka1, double angka2) {
           Double hasil = angka1 - angka2;
           return hasil;
    }
    public static Double perkalian(Double angka1, double angka2) {
           Double hasil = angka1 * angka2;
           return hasil;
    }
    public static Double pembagian(Double angka1, double angka2) {
           Double hasil = angka1 / angka2;
           return hasil;
    }
    
}
