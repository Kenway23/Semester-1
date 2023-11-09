/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SESI6;

/**
 *
 * @author acer
 */
public class DemoWhile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 5; //5 Bilangan Positif Pertama
        int hasil = 0;
        int i =1;
        while (i<=n){
            System.out.print(i);
            if (i != n) {
                System.out.print(" + ");
            }else {
                System.out.print(" = ");
            }
            hasil += i;
            i++;
        }
        System.out.println(hasil);
    }
    
}
