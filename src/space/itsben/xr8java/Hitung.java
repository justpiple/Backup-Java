package space.itsben.xr8java;

import java.util.Scanner;

public class Hitung {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(ANSI_GREEN + "PENGHITUNG LUAS" + ANSI_RESET);
        int panjang = getInputInt("Masukkan panjang: ");
        int lebar = getInputInt("Masukkan lebar: ");
        int luas = panjang*lebar;
        int keliling = 2*(lebar+panjang);
        System.out.printf("Hasil luas dari panjang: %s, lebar: %s adalah %s\n", panjang, lebar, luas);
        System.out.printf("Hasil keliling dari panjang: %s, lebar: %s adalah %s", panjang, lebar, keliling);
    }
    static int getInputInt(String args){
        System.out.print(args);
        int reqInput = input.nextInt();
        return reqInput;
    }
    static String getInputString(String args, boolean isRequired){
        System.out.print(args);
        String reqInput = input.nextLine();
        if (isRequired && reqInput == "") {
            System.out.println(ANSI_RED + "Please input data!" + ANSI_RESET);
            return getInputString(args, true);
        }
        return reqInput;
    }
}
