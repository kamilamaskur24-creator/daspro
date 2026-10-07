package Pertemuan3;

import java.util.Scanner;

public class TugasNo1 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);
        int harga_laptop, uang_muka, jml_bulan, sisa_harga;
        double bunga = 0.02;
        double cicilan;

        harga_laptop = nuha.nextInt();
        uang_muka = nuha.nextInt();
        jml_bulan = nuha.nextInt();
        sisa_harga = harga_laptop - uang_muka;
        bunga =  sisa_harga * 0.02;
        cicilan = (sisa_harga +  bunga) / jml_bulan;

        System.out.println("Maka besar ciclan setiap bulannya adalah: " + cicilan);

        





    }


}
