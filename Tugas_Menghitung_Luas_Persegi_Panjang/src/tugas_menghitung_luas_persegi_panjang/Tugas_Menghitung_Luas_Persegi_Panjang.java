package tugas_menghitung_luas_persegi_panjang;
import java.util.Scanner;
public class Tugas_Menghitung_Luas_Persegi_Panjang {

    public static void main(String[] args) {
        // TODO code application logic here
        int p,l;
        float Luas;
        
        Scanner angka = new Scanner (System.in);
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.println("===============================");
        
        System.out.print("Masukan Panjang = ");
        p = angka.nextInt();
        System.out.print("Masukan Luas = ");
        l = angka.nextInt();
        System.out.println("===============================");
        
        Luas = p*l;
        System.out.print("Luas Persegi Panjang Adalah = "+Luas);
    }
    
}
