/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Latihan4 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int jarak, waktu;
        System.out.print("Masukkkan jarak: " );
        jarak = masukan.nextInt();
        System.out.print("Masukkan waktu tempuh: " );
        waktu = masukan.nextInt();
        
        int kecepatan = jarak/waktu;
        System.out.println("kecepatan : " + kecepatan + "km/jam");
    }
    
}
