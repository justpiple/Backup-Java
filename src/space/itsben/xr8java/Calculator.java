package space.itsben.xr8java;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a, b, operator;

            System.out.println("Kalkulator Sederhana \n");
            System.out.println("Kode operator aritmatika:");
            System.out.println("1.Penjumlahan");
            System.out.println("2.Pengurangan");
            System.out.println("3.Perkalian");
            System.out.println("4.Pembagian\n");

            //Deklarasi input variabel
            System.out.print("Masukkan bilangan pertama: ");
            a = sc.nextInt();

            System.out.print("Masukkan bilangan kedua: ");
            b = sc.nextInt();

            System.out.print("Masukkan kode operator: ");
            operator = sc.nextInt();

            //Seleksi kondisi
            switch (operator){
                case 1:
                    System.out.println("Hasil: "+ (a+b));
                    break;
                case 2:
                    System.out.println("Hasil: "+ (a-b));
                    break;
                case 3:
                    System.out.println("Hasil: "+ (a*b));
                    break;
                case 4:
                    System.out.println("Hasil: "+ (a/b));
                    break;
                default:
                    System.out.println("\nOperator tidak valid!");
                    break;
            }
    }
}
