package space.itsben.xr8java;

import java.util.Scanner;

public class BagusUKL {
    public static void main(String[] args) {
        String[] RuasMasuk = {"Dupak","Waru","Sidoarjo","Porong","Kejapanan"};
        String[] RuasKeluar = {"Waru","Sidoarjo","Porong","Kejapanan","Gempol"};
        Scanner in=new Scanner(System.in);
        int biaya = 0;

        System.out.println("Id ruas masuk\n1.Dupak\n2.Waru\n3.Sidoarjo\n4.Porong\n5.Kejapanan\nMasukkan id ruas masuk :");
        int IdRuasMasuk = in.nextInt();
        int IdRuasKeluar = 0;
        int IdGolKend = 0;
        if (IdRuasMasuk == 1) {
            System.out.println("Id ruas keluar dari Dupak\n1.Waru\nMasukkan id ruas keluar :");
            IdRuasKeluar = in.nextInt();
            if (IdRuasKeluar == 1) {
                System.out.println("Id golongan kendaraan\n1.Sedan,Jip,Pick Up\n2.Truk dengan 2 sumbu roda\n3.Truk dengan 3 sumbu roda\nMasukkan golongan kendaraan anda ");
                IdGolKend = in.nextInt();
                if (IdGolKend == 1) {
                    biaya = 5000;
                } else if (IdGolKend == 2) {
                    biaya = 8000;
                } else if (IdGolKend == 3) {
                    biaya = 8000;
                } else {
                    System.out.println("Id golongan tidak ditemukan");
                }
            } else {
                System.out.println("Id yang anda masukkan tidak sesuai");
            }
        }

        System.out.printf("=Tol Struk=\nKendaraan dengan golongan %s\nMasuk dari %s\nKeluar ke %s\nBiaya masuk tol %s\n===========\t",IdGolKend,RuasKeluar[IdRuasMasuk-1],RuasKeluar[IdRuasKeluar-1],biaya);

    }
}
