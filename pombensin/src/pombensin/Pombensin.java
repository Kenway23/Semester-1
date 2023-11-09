/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pombensin;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class Pombensin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("========================");
       System.out.println("=======List Bensin======");
       System.out.println("1.Pertalite");
       System.out.println("2.Pertamax");
       System.out.println("3.dextlite");
       System.out.println("========================");
       
       Scanner inputuang = new Scanner(System.in);
        System.out.print("Masukan Uang :Rp.");
       double uang = inputuang.nextDouble();
       
       
       Scanner pilihbensin = new Scanner(System.in);
       System.out.print("Masukan Tipe Bensin :");
       int pilihan = pilihbensin.nextInt();
       
       if (pilihan==1){
           if(uang>=10000){
             double hasil = uang/10000;
           System.out.println("Rp."+uang+" mendapatkan bensin "+hasil+" liter Pertalite ");
           System.out.println("==========================================================");
           System.out.println("Uang yang diberikan : "+uang);
           System.out.println("==========================================================");
           }else{
               System.out.println("Maaf Uang anda kurang");
           }
           
       }else if(pilihan==2){
           if(uang>=10000){
             double hasil = uang/13300;
           System.out.println("Rp."+uang+" mendapatkan bensin "+hasil+" liter Pertalite ");
          System.out.println("==========================================================");
           System.out.println("Uang yang diberikan : "+uang);
           System.out.println("==========================================================");
           }else{
               System.out.println("Maaf Uang anda kurang");
           }
       }else if(pilihan==3){
           if(uang>=10000){
             double hasil = uang/16350;
           System.out.println("Rp."+uang+" mendapatkan bensin "+hasil+" liter Pertalite ");
           System.out.println("==========================================================");
           System.out.println("Uang yang diberikan : "+uang);
           System.out.println("==========================================================");
           }else{
               System.out.println("Maaf Uang anda kurang");
           }
       }else
           System.out.println("Bensin Tidak ada di menu");
            
    }
    
}
