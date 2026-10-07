package Pertemuan5;

import java.util.Scanner;

public class TugasAntrean21 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner (System.in);

        int kode_layanan;

        System.out.println(" Masukkan kode layanan");
        kode_layanan = nuha.nextInt();

        switch (kode_layanan) {
            case 1:
                System.out.println("Legalisir Ijazah, masuk loket A");
                break;
            case 2:
                System.out.println("Surat keterangan aktif kuliah, masuk loket B");
                break;
            case 3:
                System.out.println("Pembayaran ukt, masuk loket C");
                break;
            case 4:
                System.out.println("Pengajuan cuti akademik, masuk loket D");
                break;
            default:
                System.out.println(" Maaf kode layanan anda salah, layanan tidak ditemukan, Tolong ulangi lagi");
                break;
        }











    }
}
