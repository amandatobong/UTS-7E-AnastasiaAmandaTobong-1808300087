/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMI;

/**
 *
 * @author HP14s
 */
public class Bmi {
    double Bmi;
    
    void setBmi(double bb, double tb){
        Bmi=bb/(tb*tb);
    }
    
    double getBmi(){
        if (Bmi < 18){
            System.out.println("Underweight");
        }
        else if (Bmi > 18 && Bmi <=24){
            System.out.println("Normal weight");
        }
        else if (Bmi  > 24 && Bmi <=29){
            System.out.println("Overweight");
        }
        else if (Bmi > 29){
            System.out.println("Obesitas");
        }
    return Bmi;
    }
            
    
}
