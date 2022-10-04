package space.itsben.xr8java;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class UKL {
    /*public static void main(String[] args) {
        int a=14;
        int b=7;
        int u=a;
        int s=a;
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            System.out.println();
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<2+i;j++){
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            System.out.println();
        }
        s=s-u;
    }*/
    /*static int hitung(int nilai) {
        int bayar=20000;
        nilai=nilai-10;

        //pengitungan 10 kedua
        if (nilai>10){
            bayar=bayar+30000;
            nilai=nilai-10;
        }
        else {
            bayar=bayar+3000*nilai;
            nilai=0;
        }
        //pengitungan 10 ketiga
        if (nilai>10){
            bayar=bayar+40000;
            nilai=nilai-10;
        }
        else {
            bayar=bayar+4000*nilai;
            nilai=0;
        }

        //pengitungan selanjutnya
        if (nilai>10){
            bayar=bayar+5000*nilai;
        }

        return bayar;
    }
    public static void main(String[] args) {
        int id[]={1,2,3,4,5};//id pelanggan
        String[] namaPelanggan ={"Ali", "Budi", "Dani", "Edi", "Umar"};//nama pelanggan


        Scanner myObj = new Scanner(System.in);
        System.out.println("Masukkan id pelanggan");
        int idIn = myObj.nextInt();

        System.out.println("Masukkan jumlah tagihan");
        int iTagihan = myObj.nextInt();

        if (iTagihan<10) iTagihan=20000;
        else iTagihan=hitung(iTagihan);

        iTagihan=iTagihan+10000;

        System.out.println("Print Out Tagihan");
        System.out.println("ID\t:" + idIn);
        System.out.println("Nama\t:" + namaPelanggan[idIn-1]);
        System.out.println("Tagihan\t:Rp." + iTagihan+",-");
    }*/


    //UKL Bu Amalia No. 1
    public static String formatRupiah(double uang) {
        double harga = uang;

        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        return kursIndonesia.format(harga);
    }
    static Scanner Input = new Scanner(System.in);
    public static String getInput(String params){
        System.out.print(params+": ");
        return Input.nextLine();
    }
    public static void main(String[] args) {
        //Data pelanggan
        String[] namaPelanggan ={"Galuh", "Indro", "Jedi", "Kanu"};
        String[] alamatPelanggan ={"Sawojajar", "Kedung kandang", "Ijen", "Dinoyo"};
        int[] golonganPelanggan ={1, 3, 2, 3};

        int inId = Integer.parseInt(getInput("Masukkan Id")) - 1;
        int gol = golonganPelanggan[inId];
        int kwh = Integer.parseInt(getInput("Masukkan pemakaian listrik"));
        int tagihan = switch (gol) {
            case 1 -> 1000;
            case 2 -> 1300;
            case 3 -> 1500;
            default -> 0;
        }*kwh;
        tagihan = tagihan < 50000 ? 50000 : tagihan;
        tagihan+=13000;
        System.out.printf("\nDATA PELANGGAN\n========\nNama pelanggan: %s\nAlamat: %s\nGolongan: %s\n", namaPelanggan[inId], alamatPelanggan[inId], gol);
        System.out.println("Jumlah tagihan anda: "+formatRupiah(tagihan));


    }

}
