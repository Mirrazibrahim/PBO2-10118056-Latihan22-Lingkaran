/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118056.latihan22.lingkaran;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Mirrazibrahim
 * KELAS    : IF-2
 * NIM      : 10118056
 */
public class PBO210118056Latihan22Lingkaran {

    /**
     * @param args the command line arguments
     */

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.println("-----Perhitungan Lingkaran-----");
        System.out.print("Masukkan nilai diameter lingkaran :");
        Scanner input1 = new Scanner(System.in);
        String Diameter = input1.next();
        
        while(!(Diameter.matches("[0-9]*"))){
                System.out.println("Nilai Diameter Tidak Sesuai");
                System.out.println("");
                System.out.print("Masukkan Nilai Diameter Lingkaran");
                Diameter = input1.next();
        }
      
        System.out.println("-----Hasil Perhitungan Lingkaran");
        int d = Integer.parseInt(Diameter);
        int jari;
        float luas,keliling;
        jari = d/2;
        luas = (int) (3.14*jari*jari);
        keliling = (int) (2*3.14*jari);
        
        System.out.println("Jari-jari lingkaran = " + jari +"cm");
        System.out.println("Luas lingkaran = " + luas +" cm");
        System.out.println("Keliling lingkaran = " + keliling +"cm");
    }
    
    
}
