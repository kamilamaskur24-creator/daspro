package Pertemuan5;

import java.util.Scanner;

public class Tugas2Pemilihan21 {
    public static void main(String[] args) {
       Scanner nuha = new Scanner(System.in);
        int jumlah_Sks;
        System.out.println("Masukkan jumlah SKS: ");
        jumlah_Sks = nuha.nextInt();

        if(jumlah_Sks > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }





    }
    
}
