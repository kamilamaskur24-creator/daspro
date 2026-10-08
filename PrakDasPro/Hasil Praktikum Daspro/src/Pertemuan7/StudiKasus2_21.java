package Pertemuan7;

import java.util.Scanner;

public class StudiKasus221 {
    public static void main(String[] args) {
        Scanner nuha = new Scanner(System.in);
        String NamaMahasiswa;
        String JenisKegiatan;
        int jumlahdokumen;
        int peringkatJuara;
        String statusPKM;
        int dokumenKurang;

        System.out.print("Nama: "); 
        NamaMahasiswa = nuha.nextLine();

        System.out.print("Jenis Kegiatan: "); 
        JenisKegiatan = nuha.nextLine();

        System.out.print("Jumlah dokumen: "); 
        jumlahdokumen = nuha.nextInt();

        if (jumlahdokumen < 4) {

            System.out.println("Dana tidak diberikan. Dokumen kurang " + (4 - jumlahdokumen));

        } else {

            if (JenisKegiatan.equalsIgnoreCase("BELMAWA") || JenisKegiatan.equalsIgnoreCase("BAKORMA") || JenisKegiatan.equalsIgnoreCase("Mandiri")) {

                System.out.print("Peringkat: "); 
                peringkatJuara = nuha.nextInt();

                if (peringkatJuara >= 1 && peringkatJuara <= 3) 
                    System.out.println("Dana diberikan.");

                else System.out.println("Dana tidak diberikan.");

            } else if (statusPKM.equalsIgnoreCase("PKM"))

                System.out.print("Status PKM (1=Lolos, 0=Tidak): ");
                statusPKM = nuha.nextLine();

                if (statusPKM== 1) 
                    System.out.println("Dana diberikan.");

                else 
                    System.out.println("Dana tidak diberikan.");

            } {

                System.out.println("Dana tidak diberikan.");

            }

        }

    }













        


