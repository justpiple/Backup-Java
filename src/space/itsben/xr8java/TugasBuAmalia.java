package space.itsben.xr8java;

import java.util.Scanner;

public class TugasBuAmalia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Selamat datang! Silahkan melihat menu.\n==============\n1. Ayam\n2. Nasgor\n3. Soto\n4. Rawon\n5. Sate\n");
        System.out.print("Masukkan pilihan menu: ");
        int pilihan = input.nextInt();

        String result = switch (pilihan) {
            case 1 -> "Harga Ayam 10.0000";
            case 2 -> "Harga Nasgor 15.0000";
            case 3 -> "Harga Soto 12.0000";
            case 4 -> "Harga Rawon 20.0000";
            case 5 -> "Harga Sate 17.0000";
            default -> "Menu tidak ada!";
        };

        System.out.println(result);
    }
}
