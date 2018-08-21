/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9;

/**
 *
 * @author WINDOWS 10
 */
public class Latihan5  {
    public static void main(String[] args) {
 int a, b, c, d;
 a = 206;
 b = 125;
 c = 338;
 if (a>b && a>c){
     d = a;
 }else if (b>a && b>c){
     d = b;
 }else{
     d = c;
 }
 System.out.println("Masukkan bilangan1:"+ a);
 System.out.println("Masukkan bilangan2:"+ b);
 System.out.println("Masukkan bilangan3: " + c);
 System.out.println("Nilai terbesar adalah "+ d);
 }
    }

