package Pertemuan5;

import java.util.Scanner;

public class Tugas1Pemilihan21 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);
        System.out.println(" _ _ _ Cetak KRS SIAKAD _ _ _");
        System.out.println(" Apakah UKT sudah lunas? (true/false): ");

        boolean uktLunas = nuha.nextBoolean();
        
        String pesan = (uktLunas)? "Pembayaran telah dilakukan" : "tolong bayar terlebih dahulu";
        System.out.println(""+pesan);
    
    }
}
