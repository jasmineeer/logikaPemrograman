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
public class soalKetiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int angka;
        int hasil = 0;
        
        Scanner bilangan = new Scanner(System.in);
        System.out.println("Masukkan bilangan: ");
        angka = bilangan.nextInt();
        
        for (int i=1; i<=angka; i++) {
            hasil += i;
        }
        System.out.println("Jumlah bilangan "+hasil);
    }
}
