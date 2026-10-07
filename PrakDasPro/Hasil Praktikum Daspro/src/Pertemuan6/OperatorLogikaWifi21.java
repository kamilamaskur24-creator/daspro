package Pertemuan6;

import java.util.Scanner;

public class OperatorLogikaWifi21 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);
        boolean Mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.println(" Apakah pengguna mahasiswa? (true/false): ");
        Mahasiswa = nuha.nextBoolean();
        System.out.println(" Apakah pengguna dosen? (true/false): ");
        dosen = nuha.nextBoolean();
        System.out.println(" Apakah akun sedang diblokir? (true/false) ");
        akunDiblokir = nuha.nextBoolean();

        if ((Mahasiswa || dosen) && !akunDiblokir)  {
            System.out.println("Akses Wifi diberikan");
        } else {
            System.out.println("Akses Wifi ditolak");
        }
    
    


    }
}
