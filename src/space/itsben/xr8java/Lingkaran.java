package space.itsben.xr8java;

public class Lingkaran {
    public static void main(String[] args) {
        double phi, jari2, luas, alas, keliling, diameter;
        phi = 3.14;
        jari2 = 5.6;
        diameter = 2*jari2;
        luas = phi * jari2 * jari2;
        keliling = phi * diameter;
        System.out.printf("\u001B[32m" + "Jari-jari: %s\nDiameter: %s\nLuas lingkaran: %s\nKeliling lingkaran: %s", jari2, diameter,luas, keliling);
    }
}
