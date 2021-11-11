/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

/**
 *
 * @author HP14s
 */
public class BmiBeraksi {
    public static void main(String[] args) {
        Bmi Bmiku = new Bmi();
        System.out.println("Perhitungan BMI");
        System.out.println("");
        
        Bmiku.setBmi(62, 1.63);
        System.out.println("BMI Saya: " + Math.round(Bmiku.getBmi()));
        System.out.println();
        
        Bmi BmiDia = new Bmi();
        
        BmiDia.setBmi(41, 1.58);
        System.out.println("BMI Vonny: " + Math.round(BmiDia.getBmi()));
        System.out.println("");
     
    }
    
}
