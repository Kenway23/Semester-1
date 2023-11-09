/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesi5Objek;

/**
 *
 * @author acer
 */
public class DemoIfDuaObjek {
    public void checkBilangan (int bilangan){
        if(bilangan < 0) {
            System.out.println(bilangan + " Merupakan bilangan negatif");
        }
        else if(bilangan == 0) {
            System.out.println("Nilai yang dimsukan adalah NOL ");
        }
        else {   // (bilangan > 0 )
            System.out.println(bilangan + " Merupakan bilangan POSITIF");
        }
    }
}
