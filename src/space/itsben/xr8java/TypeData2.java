package space.itsben.xr8java;

public class TypeData2 {
    public static void main(String[] args) {

        //type data integer
        int sisi = 20;
        //math pow harus menggunakan double karena kemungkinan nilai koma
        double luas = Math.pow(sisi, 2);
        System.out.println("Luas: "+luas);
        System.out.println("sisi: "+sisi);
        System.out.printf("%s ini adalah sisi", sisi);
    }
}
