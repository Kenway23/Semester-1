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
public class DemoForPrima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int bilangan = 7;
       boolean prima = true;
       for (int i=2; i <= (bilangan/2); i++){
           if ( (bilangan % i ) == 0){
               prima = false;
               break; // Menghentikan pengulangan
           }
       }
       if (prima){
           System.out.println(bilangan + " Merupakan Bilangan Prima ");
       }else {
           System.out.println(bilangan + " Bukan Bilangan Prima ");
       }
    }
    
}
