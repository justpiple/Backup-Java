package space.itsben.xr8java;

public class Segitiga {
    public static void main(String[] args) {
        int alas, tinggi, sisiMiring, keliling;
        double luas;

        alas = 20;
        tinggi = 35;
        sisiMiring = 45;

        luas = 0.5*alas*tinggi;
        keliling = alas+tinggi+sisiMiring;

        System.out.printf("\u001B[32m" + "Luas: %s\nKeliling: %s\n", luas, keliling);
        double test = Math.sqrt(4);
        System.out.println(test);
    }
}
