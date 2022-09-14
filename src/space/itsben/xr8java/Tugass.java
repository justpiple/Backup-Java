package space.itsben.xr8java;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Tugass {

    public static void main(String[] args) {
        /*Scanner inputUser = new Scanner(System.in);*/

        /*System.out.print("Sudah Lulus SMP? (Ya/Tidak): ");
        String lulus = inputUser.nextLine();
        System.out.print("Masukkan umur: ");
        int umur = inputUser.nextInt();

        if (lulus.toLowerCase().equals("ya") && umur >= 17) System.out.println("Selamat di SMK Telkom MLG");
        else System.out.println("Tidak memenuhi syarat!");*/
        /*System.out.print("Input bilangan 1: ");
        int bilangan1 = inputUser.nextInt();
        System.out.print("Input bilangan 2: ");
        int bilangan2 = inputUser.nextInt();
        System.out.print("Input bilangan 3: ");
        int bilangan3 = inputUser.nextInt();
        int terbesar;

        if (bilangan1 > bilangan2 && bilangan1 > bilangan3) System.out.println(bilangan1 + " Lebih besar");
        else if (bilangan2 > bilangan1 && bilangan2 > bilangan3) System.out.println(bilangan2 + " Lebih besar");
        else System.out.println(bilangan3 + " Lebih besar");*/



        /*System.out.print("Input hari: ");
        int hari = inputUser.nextInt();

        switch (hari) {
            case 1 -> System.out.println("Senin");
            case 2 -> System.out.println("Selasa");
            case 3 -> System.out.println("Rabu");
            case 4 -> System.out.println("Kamis");
            case 5 -> System.out.println("Jumat");
            case 6 -> System.out.println("Sabtu");
            case 7 -> System.out.println("Minggu");
            default -> System.out.println("GAK ADA");
        }*/


       /* System.out.print("Kamar (Melati/Mawar): ");
        String kamar = inputUser.nextLine();
        System.out.print("Nama hari: ");
        String hari = inputUser.nextLine();
        String[] weekend = {"sabtu", "minggu"};
        if (kamar.equals("Melati")){
            if (Arrays.asList(weekend).contains(hari)){
                System.out.println("");
            } else System.out.println("weekdays");
        }*/
        int nilai = 0;
        do {
            System.out.println("perulangan ke -" +nilai);
            nilai++;
        }
        while (nilai <= 10);
    }
}
