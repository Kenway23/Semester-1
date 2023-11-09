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
public class DemoFor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 11; // 10 bilangan positif pertama
        int hasil = 0;
        for (int i=1; i<=n; i++){
            hasil += i;
            if (i != n ) {
                System.out.print(i + " + ");
            }else {
                System.out.print(" = ");
            }
        }
        System.out.println(hasil);
    }
    
}
