/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLI;

/**
 *
 * @author HP14s
 */
import java.util.Scanner;
public class ProgramCLI {
    public static void main(String[] args) {
        ModulUtama();
        
    }
    public static void ModulUtama(){
        Scanner s = new Scanner(System.in);
        System.out.println("\n [Pilihan]");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukan Pilihan Anda");
        int pilih = s.nextInt();
        switch(pilih){
            case 1: ModulTambah();break;
            case 2: ModulKurang();break;
            case 3: ModulKali();break;
            case 4: ModulBagi();break;
        }
    }
    public static void ModulTambah(){
        Scanner s = new Scanner(System.in);
        System.out.println("\n [Penjumlahan]");
        System.out.print("Masukan Nilai Pertama: ");
        Double num1 = s.nextDouble();
        System.out.print("Masukan Nilai Kedua: ");
        Double num2 = s.nextDouble();
        System.out.println("Jadi " + String.valueOf(num1)+ "+" + String.valueOf(num2) + "=" + (num1 + num2) );
        
        ModulUtama();
    }
    public static void ModulKurang(){
        Scanner s = new Scanner(System.in);
        System.out.println("\n [Pengurangan]");
        System.out.print("Masukan Nilai Pertama: ");
        Double num1 = s.nextDouble();
        System.out.print("Masukan Nilai Kedua: ");
        Double num2 = s.nextDouble();
        System.out.println("Jadi " + String.valueOf(num1)+ "-" + String.valueOf(num2) + "=" + (num1 - num2) );
        
        ModulUtama();
    }
    public static void ModulKali(){
        Scanner s = new Scanner(System.in);
        System.out.println("\n [Perkalian]");
        System.out.print("Masukan Nilai Pertama: ");
        Double num1 = s.nextDouble();
        System.out.print("Masukan Nilai Kedua: ");
        Double num2 = s.nextDouble();
        System.out.println("Jadi " + String.valueOf(num1)+ "*" + String.valueOf(num2) + "=" + (num1 * num2) );
        
        ModulUtama();
    }
    public static void ModulBagi(){
        Scanner s = new Scanner(System.in);
        System.out.println("\n [Pembagian]");
        System.out.print("Masukan Nilai Pertama: ");
        Double num1 = s.nextDouble();
        System.out.print("Masukan Nilai Kedua: ");
        Double num2 = s.nextDouble();
        System.out.println("Jadi " + String.valueOf(num1)+ "/" + String.valueOf(num2) + "=" + (num1 / num2) );
        
        ModulUtama();
    }
    
}
