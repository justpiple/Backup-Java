package space.itsben.xr8java;

import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = inputUser.nextLine();
        System.out.print("Umur : ");
        int umur = inputUser.nextInt();

        //proses
        if (umur >= 18) System.out.printf("Halo %s, selamat menonton film", nama);
        else if (umur <= 3) System.out.printf("Halo adek %s, minum susu dulu sana", nama);
        else System.out.printf("Halo %s, \u001B[31mkamu masih berumur %s tidak dapat menonton film 18+", nama, umur);
    }
}
