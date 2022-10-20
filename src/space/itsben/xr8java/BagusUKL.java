package space.itsben.xr8java;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class BagusUKL {

    static Scanner in = new Scanner(System.in);
    public static int[] BiayaGolonganKend(int biayaParams) {
        System.out.println("Id golongan kendaraan\n1.Sedan,Jip,Pick Up\n2.Truk dengan 2 sumbu roda\n3.Truk dengan 3 sumbu roda\nMasukkan golongan kendaraan anda ");
        int idGolKend = in.nextInt();
        int biaya = 0;
        if (idGolKend == 1) {
            biaya = 4000+biayaParams;
        } else if (idGolKend == 2 || idGolKend == 3) {
            biaya = 7000+biayaParams;
        } else {
            System.out.println("Id golongan tidak ditemukan");
            System.exit(0);
        }
        return new int[]{biaya, idGolKend};
    }
    public static String formatRupiah(double uang) {
        double harga = uang;

        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator('.');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        return kursIndonesia.format(harga);
    }
    public static void main(String[] args) {
        String[] RuasMasuk = {"Dupak","Waru","Sidoarjo","Porong","Kejapanan"};
        String[] RuasKeluar = {"Waru","Sidoarjo","Porong","Kejapanan","Gempol"};
        int biaya = 0;
        int GolKend = 0;

        System.out.println("==Selamat Datang==\nId ruas masuk\n1.Dupak\n2.Waru\n3.Sidoarjo\n4.Porong\n5.Kejapanan\nMasukkan id ruas masuk :");
        int IdRuasMasuk = in.nextInt();
        int IdRuasKeluar = 0;
        int[] iBiaya = {0,0};
        int idGolKend = 0;

        if (IdRuasMasuk == 1) { //Dupak
            System.out.println("Id ruas keluar dari Dupak\n1.Waru\nMasukkan id ruas keluar :");
            IdRuasKeluar = in.nextInt();
            if (IdRuasKeluar == 1) {
                iBiaya[0] = 1000;
                iBiaya = BiayaGolonganKend(iBiaya[0]);
            } else {
                System.out.println("Id yang anda masukkan tidak sesuai");
                System.exit(0);
            }
        } else if (IdRuasMasuk == 2) { //Waru
            System.out.println("Id ruas keluar dari Waru\n1.Sidoarjo\n2.Porong\nMasukkan id ruas keluar :");
            IdRuasKeluar = in.nextInt();
            if (IdRuasKeluar == 1) {
                IdRuasKeluar = 2;
                iBiaya[0] = 2000;
                iBiaya = BiayaGolonganKend(iBiaya[0]);
            } else if (IdRuasKeluar == 2) {
                IdRuasKeluar = 3;
                iBiaya[0] = 5000;
                iBiaya = BiayaGolonganKend(iBiaya[0]);
            } else {
                System.out.println("Id yang anda masukkan tidak sesuai");
                System.exit(0);
            }
        } else if (IdRuasMasuk == 3) { //Sidoarjo
            System.out.println("Id ruas keluar dari Sidoarjo\n1.Waru\n2.Porong\nMasukkan id ruas keluar :");
            IdRuasKeluar = in.nextInt();
            if (IdRuasKeluar == 1) {
                iBiaya[0] = 2000;
                iBiaya = BiayaGolonganKend(iBiaya[0]);
            } else if (IdRuasKeluar == 2) {
                IdRuasKeluar = 3;
                iBiaya[0] = 1500;
                iBiaya = BiayaGolonganKend(iBiaya[0]);
            } else {
                System.out.println("Id yang anda masukkan tidak sesuai");
                System.exit(0);
            }
        } else if (IdRuasMasuk == 4) { //Porong
            System.out.println("Id ruas keluar dari Porong\n1.Sidoarjo\n2.Waru\n3.Kejapanan\nMasukkan id ruas keluar :");
            IdRuasKeluar = in.nextInt();
            if (IdRuasKeluar == 1) {
                IdRuasKeluar = 2;
                iBiaya[0] = 1500;
                iBiaya = BiayaGolonganKend(iBiaya[0]);
            } else if (IdRuasKeluar == 2) {
                IdRuasKeluar = 1;
                iBiaya[0] = 5000;
                iBiaya = BiayaGolonganKend(iBiaya[0]);
            } else if (IdRuasKeluar == 3) {
                idGolKend = in.nextInt();
                biaya = 0;
                idGolKend = 4;
                if (idGolKend == 1) {
                    biaya = 6000;
                    iBiaya[0] = biaya;
                } else if (idGolKend == 2 || idGolKend == 3) {
                    biaya = 8500;
                    iBiaya[0] = biaya;
                } else {
                    System.out.println("Id golongan tidak ditemukan");
                    System.exit(0);
                }
            } else {
                System.out.println("Id yang anda masukkan tidak sesuai");
                System.exit(0);
            }
        } else if (IdRuasMasuk == 5) { //Kejapanan
            System.out.println("Id ruas keluar dari Porong\n1.Gempol\nMasukkan id ruas keluar :");
            IdRuasKeluar = in.nextInt();
            if (IdRuasKeluar == 1) {
                System.out.println("Id golongan kendaraan\n1.Sedan,Jip,Pick Up\n2.Truk dengan 2 sumbu roda\n3.Truk dengan 3 sumbu roda\nMasukkan golongan kendaraan anda ");
                idGolKend = in.nextInt();
                biaya = 0;
                IdRuasKeluar = 5;
                if (idGolKend == 1) {
                    biaya = 3000;
                    iBiaya[0] = biaya;
                } else if (idGolKend == 2 || idGolKend == 3) {
                    biaya = 5000;
                    iBiaya[0] = biaya;
                } else {
                    System.out.println("Id golongan tidak ditemukan");
                    System.exit(0);
                }
            }
        } else {
            System.out.println("Id yang anda masukkan tidak sesuai");
            System.exit(0);
        }

        System.out.printf("==Tol Struk==\nKendaraan dengan golongan %s\nMasuk dari %s\nKeluar ke %s\nBiaya masuk tol %s\n=============\t",iBiaya[1] == 0 ? idGolKend : iBiaya[1],RuasKeluar[IdRuasMasuk-1],RuasKeluar[IdRuasKeluar-1],formatRupiah(iBiaya[0]));
    }
}
