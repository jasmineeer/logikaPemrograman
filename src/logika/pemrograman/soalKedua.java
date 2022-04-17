/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logika.pemrograman;

import java.util.Scanner;
/**
 *
 * @author Jasmi
 */
public class soalKedua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int angka;
        Scanner number = new Scanner(System.in);
        
        System.out.println("Masukkan angka: ");
        angka = number.nextInt();
        
        if(angka % 2 == 0) {
            System.out.println("Angka " +angka+ " merupakan bilangan genap");
        } else{
            System.out.println("Angka " +angka+ " merupakan bilangan ganjil");
        }
    }
    
}
