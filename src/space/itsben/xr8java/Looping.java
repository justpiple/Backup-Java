package space.itsben.xr8java;
// import java.util.Arrays;
import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);
        /*String input = "";
        do {
            System.out.print("Silahkan ketik 'ya' untuk berhenti: ");
            input = inputUser.nextLine();
        } while (!input.equalsIgnoreCase("ya"));*/

        /*for (int i=5;i>0;i--){
            for (int j=0;j<i;j++) System.out.print(j+1);
            System.out.print("\n");
        }*/

        /*System.out.print("Masukkan angka (1-10): ");
        int input = inputUser.nextInt();
        if (input > 10) System.out.println("Angka tidak boleh lebih dari 10!");
        else for (int i = 1;i<=10;i++) System.out.printf("%s X %s = %s\n", input, i, input*i);*/
        System.out.print("Masukkan angka: ");
        int input = inputUser.nextInt();
        int hasil = 1;
        System.out.println(input+"!");
        for (int i=1;i<=input;i++) {
            hasil = hasil*i;
            System.out.print(i + ((i ==input) ? "" : " X "));
        }
        System.out.print(" = " + hasil);

    }
}
