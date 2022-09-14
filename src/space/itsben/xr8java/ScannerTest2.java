package space.itsben.xr8java;

import java.util.Scanner;

public class ScannerTest2 {
    public static void main(String[] args){

        //input
        String name = getInput("Masukkan nama anda: ", true);
        String absen = getInput("Masukkan absen anda: ", true);
        String kelas = getInput("Masukkan kelas anda: ", false);
        System.out.printf("Nama saya %s no absen %s, dari kelas %s", name, absen, kelas);
    }

    static String getInput(String args, boolean isRequired){
        Scanner inputUser = new Scanner(System.in);
        System.out.print(args);
        String reqInput = inputUser.nextLine();
        if (isRequired && reqInput == "") {
            System.out.println("Please input data!");
            return getInput(args, true);
        }
        return reqInput;
    }
}