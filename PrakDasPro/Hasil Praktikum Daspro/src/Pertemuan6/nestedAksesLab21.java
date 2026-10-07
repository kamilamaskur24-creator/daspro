package Pertemuan6;

import java.util.Scanner;

public class nestedAksesLab21 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);
        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.println("Apakah mahasiswa Aktif? (true/false): ");
        mahasiswaAktif = nuha.nextBoolean();
        System.out.println("Apakah sedang disanksi? (true/false): ");
        sedangDisanksi = nuha.nextBoolean();
        System.out.println(" Apakah punya Izin dosen? (true/false): ");
        punyaIzinDosen = nuha.nextBoolean();
        System.out.println(" Apakah asisten Lab? (true/false): ");
        asistenLab = nuha.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }



    }
}
