package Pertemuan3;

import java.util.Scanner;

public class Koperasi21 {
public static void main(String [] args) {
    Scanner input = new Scanner(System.in);

    int paket_alat_tulis = 12000;
    int biaya_modal_tetap = 1352500;
    int jml_anggota = 8;
    int jmlh_paket_terjual;
    int pendapatan;
    int Laba;
    int bagian_yang_tidak_habis;
    int sisa_kas;
    int koperasi_buka = 6;
    double bagian_anggota;

    jmlh_paket_terjual = paket_alat_tulis ^ jml_anggota;
    pendapatan = jmlh_paket_terjual ^ biaya_modal_tetap ^ jml_anggota;

    System.out.println("Pendapatan " + pendapatan);
    System.out.println("Laba " + Laba);
    System.out.println("Bagian anggota "+ bagian_anggota);
    System.out.println("Sisa kas"+ sisa_kas);









}

}
