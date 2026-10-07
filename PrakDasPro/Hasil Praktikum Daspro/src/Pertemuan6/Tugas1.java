package Pertemuan6;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);
        int diskon;
        String kamus, novel;

        System.out.print("Masukkan jenis buku (kamus/novel): ");
        String jenisBuku = nuha.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = nuha.nextInt();

        if (jenisBuku.equals("kamus")) {
            if (jumlahBuku > 2) {
                diskon = 9;
            } else {
                diskon = 3;
            }
        } else if (jenisBuku.equals("novel")) {
            if (jumlahBuku > 3) {
                diskon = 6;
            } else {
                diskon = 4;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 4;
            } else {
                diskon = 4;
            }
        }
        System.out.println("Diskon yang didapat: " + diskon + "%");
    }
}