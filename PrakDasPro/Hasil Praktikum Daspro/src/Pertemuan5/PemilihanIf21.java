package Pertemuan5;

import java.util.Scanner;

public class PemilihanIf21 {
    public static void main(String[] args) {
        Scanner nuha =  new Scanner(System.in);
        System.out.println(" _ _ _ Cetak KRS SIAKAD _ _ _");
        System.out.println(" Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = nuha.nextBoolean();
        
        if (uktLunas) {
            System.out.println("Pembayaran UKT terverikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA ");
        } else {
            System.out.println(" Regristasi ditolak. Silahkan Lunasi UKT terlebih dahulu");
        
        }        
    
    

    
    }
}