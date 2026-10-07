package Pertemuan6;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);
        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        boolean aktif = nuha.nextBoolean();

        System.out.print("Apakah mendapat sanksi akademik? (true/false): ");
        boolean sanksi = nuha.nextBoolean();

        System.out.print("Masukkan nilai Dasar Pemrograman: ");
        int nilaiDP = nuha.nextInt();

        System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
        boolean sertifikat = nuha.nextBoolean();

        if (aktif && !sanksi) {

            if (nilaiDP >= 85 || sertifikat) {

                System.out.print("Masukkan nilai wawancara: ");
                int nilaiWawancara = nuha.nextInt();

                if (nilaiWawancara >= 80) {
                    System.out.println("Mahasiswa diterima sebagai asisten praktikum.");
                } else {
                    System.out.println("Mahasiswa gagal pada tahap wawancara.");
                    System.out.println("Alasan: nilai wawancara kurang dari 80.");
                }

            } else {
                System.out.println("Mahasiswa gagal pada tahap seleksi nilai Dasar Pemrograman.");
                System.out.println("Alasan: nilai Dasar Pemrograman kurang dari 80 dan tidak memiliki sertifikat kompetensi.");
            }

        } else {
            System.out.println("Mahasiswa gagal pada tahap seleksi awal.");

            if (!aktif && sanksi) {
                System.out.println("Alasan: mahasiswa tidak berstatus aktif dan sedang mendapat sanksi akademik.");
            } else if (!aktif) {
                System.out.println("Alasan: mahasiswa tidak berstatus aktif.");
            } else {
                System.out.println("Alasan: mahasiswa sedang mendapat sanksi akademik.");
            }
        }

        nuha.close();
    }
}




    
