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
public class soalPertama {
    public static void main(String[] args) {
        int pertama, kedua, terbesar;
        Scanner number = new Scanner(System.in);
        
        System.out.println("Masukkan angka pertama: ");
        pertama = number.nextInt();
        
        System.out.println("Masukkan angka kedua: ");
        kedua = number.nextInt();
        
        if(pertama > kedua) {
            System.out.println("Angka yang terbesar adalah "+pertama);
        } else if (kedua > pertama) {
            System.out.println("Angka yang terbesar adalah "+kedua);
        }
    }
}
