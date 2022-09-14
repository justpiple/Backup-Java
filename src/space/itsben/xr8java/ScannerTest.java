package space.itsben.xr8java;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args){

        //input
        int TotalBelanja, bayar, diskon;
        String member;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Apakah anda memiliki kartu member : ");
        member = inputUser.nextLine();
        System.out.print("Total belanjaan : ");
        TotalBelanja = inputUser.nextInt();

        //proses
        if(member.equalsIgnoreCase("ya")){
            if(TotalBelanja >= 500000){
                diskon = 50000;
            } else if(TotalBelanja >= 100000){
                diskon = 15000;
            } else {
                diskon = 0;
            }
        } else {
            if (TotalBelanja >= 100000){
                diskon = 10000;
            }
            else {
                diskon = 0;
            }
        }
        //output
        bayar = TotalBelanja - diskon;
        System.out.println("Total Bayar: " + bayar);
    }

}