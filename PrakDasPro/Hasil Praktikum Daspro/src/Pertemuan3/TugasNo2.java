package Pertemuan3;

import java.util.Scanner;

public class TugasNo2 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);
        int jml_lembar;
        int harga_perlembar = 500;
        int harga_penjilidan = 5000;
        int total_biaya;

        jml_lembar = nuha.nextInt();

        total_biaya = jml_lembar + harga_perlembar + harga_penjilidan;
        
        System.out.println(" Total biaya yang harus dibayar: " + total_biaya);
        




    }
    
}
