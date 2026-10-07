package Pertemuan2;

import java.util.Scanner;

public class StudiKasus1 { 
    public static void main (String[] arg) {
        Scanner input = new Scanner(System.in);
        
        int jml_gajipokok = 5000000; 
        int tunjangan_anak_perbulan = 100000; 
        int jml_anak = 4;
        double potongan = 0.10;

        int total_Tunjangan = tunjangan_anak_perbulan * jml_anak;
        double potongan_Pensiun = potongan * jml_gajipokok;
        double gaji_Bersih =  jml_gajipokok + total_Tunjangan - potongan_Pensiun;

        System.out.println("Gaji bersih " + gaji_Bersih);











    }
    
    
}
