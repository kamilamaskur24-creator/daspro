package Pertemuan5;

import java.util.Scanner;

public class TugasParkir21 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);
        int lama_parkir;
        int Tarif_dasar = 2000;
        int Tarif_setiap_jam_berikutnya = 1000;
        int Total_Parkir;
        
        System.out.println("Masukkan Lama Parkir");
        lama_parkir = nuha.nextInt();

        if ( lama_parkir <= 2) {
            Total_Parkir = Tarif_dasar;
        } else  {
            Total_Parkir = Tarif_dasar + (lama_parkir-2) * Tarif_setiap_jam_berikutnya;
        
        System.out.println("Sehingga Total biaya parkir:" + Total_Parkir);
        
    
    
    
        }
    }
}
