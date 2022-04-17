/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logika.pemrograman;

/**
 *
 * @author Jasmi
 */
public class soalKeempat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int awal[] = {4, 6, 1, 3};
//        System.out.println("Masukkan bilangan: ");
//        baru = number.nextInt();
        
        System.out.print("\n Genap : ");
        for (int i = 0; i < 10; i++) {
            if (awal[i] % 2 == 0) {
                System.out.print(awal[i] + ", ");
 
            }
        }
 
        System.out.print("\n Ganjil : ");
        for (int j = 0; j < 10; j++) {
            if (awal[j] % 2 != 0) {
                System.out.print(awal[j] + ", ");
            }
        }
    }
    
}
