package space.itsben.xr8java;

public class ModulProgdas6 {
    public static void main(String[] args) {
        int nilai = 30;
        String predikat, kriteria;

        if (nilai >= 90) predikat = "A";
        else if (nilai >= 80) predikat = "B+";
        else if (nilai >= 70) predikat = "B";
        else if (nilai >= 60) predikat = "C+";
        else if (nilai >= 50) predikat = "C";
        else if (nilai >= 40) predikat = "D";
        else predikat = "E";

        kriteria = switch (predikat) {
            case "A" -> "Perfect";
            case "A-" -> "Excelent";
            case "B+" -> "Well done";
            case "B" -> "You Passed";
            case "B-" -> "Better try again";
            default -> "Invalid grade";
        };

        System.out.printf("Nilai anda %s memasuki predikat %s dengan kriteria %s", nilai, predikat, kriteria);


        /*int nilai = 100;
        String predikat, kriteria;
        kriteria = "";

        if (nilai > 95) predikat = "A";
        else if (nilai > 90) predikat = "A-";
        else if (nilai > 85) predikat = "B+";
        else if (nilai > 80) predikat = "B";
        else if (nilai > 74) predikat = "B-";
        else if (nilai > 69) predikat = "C+";
        else if (nilai > 64) predikat = "C";
        else if (nilai > 59) predikat = "C-";
        else if (nilai > 54) predikat = "D+";
        else predikat = "D";

        kriteria = switch (predikat) {
            case "A" -> "Sangat baik";
            case "A-" -> "Sangat baik";
            case "B+" -> "Baik";
            case "B" -> "Baik";
            case "B-" -> "Baik";
            case "C+" -> "Cukup";
            case "C" -> "Cukup";
            case "C-" -> "Cukup";
            case "D+" -> "Kurang";
            case "D" -> "Kurang";
            default -> kriteria;
        };

        System.out.printf("Nilai anda %s memasuki predikat %s dengan kriteria %s", nilai, predikat, kriteria);*/
    }
}
