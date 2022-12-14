package space.itsben.xr8java;
import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bakti Alam Cottage\n============");
        System.out.println("Pilihan cottage\n1. Duku\n2. Jeruk\n3. Alpukat\n4. Jambu Air\n5. Durian\n6. Melon\n7. Belimbing\n8. Mangga\n9. Kedondong\n10. Barrack");
        System.out.print("Pilih cottage: ");
        int kamar = input.nextInt();
        int jumlah = 0;
        if (kamar == 9) {
            System.out.print("Masukkan jumlah orang:");
            jumlah = input.nextInt();
        }
        System.out.print("Hari (weekday/weekend/holiday): ");
        String day = input.next().toLowerCase();

        int harga = switch (kamar) {
            case 1, 2 -> day.equals("weekday") ? 915000 : day.equals("weekend") ? 1025000 : day.equals("holiday") ? 1225000 : 0;
            case 3, 4 -> day.equals("weekday") ? 575000 : day.equals("weekend") ? 695000 : day.equals("holiday") ? 895000 : 0;
            case 5, 6 -> day.equals("weekday") ? 595000 : day.equals("weekend") ? 715000 : day.equals("holiday") ? 915000 : 0;
            case 7, 8, 9 -> day.equals("weekday") ? 495000 : day.equals("weekend") ? 575000 : day.equals("holiday") ? 755000 : 0;
            case 10 -> day.equals("weekday") ? 25000 : day.equals("weekend") ? 25000 : day.equals("holiday") ? 35000 : 0;
            default -> 0;
        };
        if (harga == 0) System.out.println("Terjadi kesalahan!");
        else System.out.printf("Total harga yang harus dibayarkan adalah: %s", kamar == 9 ? harga*jumlah : harga);


    }
}
