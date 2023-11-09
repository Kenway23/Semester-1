/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ganjilgenap;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class Ganjilgenap {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int bilangan = inputan.nextInt();
        if (bilangan %2 == 0){
            System.out.println(bilangan+" Addalah Bilangam Genap");
        }
        else
            System.out.println(bilangan+" Addalah Bilangan Ganjil");
    }
}
