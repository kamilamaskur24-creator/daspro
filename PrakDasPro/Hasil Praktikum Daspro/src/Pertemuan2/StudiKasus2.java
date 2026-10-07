package Pertemuan2;

import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lebarTanah = 30; 
        int panjangTanah = 100;
        int diameterKolam = 5;
        int sisiTaman = 2;

        int luas_Tanah = lebarTanah * panjangTanah;
        int jariJariKolam = diameterKolam/2;
        double luasKolam = 3.14 * jariJariKolam * jariJariKolam;
        int luasTaman = sisiTaman * sisiTaman;
        double luasTanahYangTidakDigunakan = luas_Tanah - luasKolam - luasTaman;

        System.out.println("Luas Tanah Yang Tidak Digunakan " + luasTanahYangTidakDigunakan);





    }
    
}
