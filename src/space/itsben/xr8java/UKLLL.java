package space.itsben.xr8java;

import java.util.Scanner;

public class UKLLL {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[]id = {1,2,3,4};
        String []nama = {"Galuh","Indro","Jedi","Kanu"};
        int []golongan = {1,3,2,3};
        String[]alamat = {"Sawojajar","Kedung Kandang","Ijen","Dinoyo"};
        int idPelanggan, pemakaian, tarif, tagihan;
        System.out.println("Masukkan id pelanggan:");
        idPelanggan = obj.nextInt();
        System.out.println("Masukkan banyak pemakaian:");
        pemakaian = obj.nextInt();

        System.out.println("Id:" + id[idPelanggan-1]);
        System.out.println("Nama" + nama[idPelanggan-1]);
        System.out.println("Golongan:" + golongan[idPelanggan-1]);
        System.out.println("Alamat:" + alamat[idPelanggan-1]);

        //Golongan tarif
        if(golongan[idPelanggan-1]==1){
            tarif = 1000;
        } else if (golongan [idPelanggan-1]==2){
            tarif = 1300;
        } else {
            tarif = 1500;
        }

        //Perhitungan tarif
        tagihan = tarif * pemakaian; //Tarih dikali pemakaian
        //Jika tarif kurang dari 50k dianggap 50k
        if (tagihan < 50000){
            tagihan = 50000;
        }

        System.out.println("yang harus dibayar: Rp" + (tagihan +13000)); //Ditambah 13k untuk biaya admin
    }
}
