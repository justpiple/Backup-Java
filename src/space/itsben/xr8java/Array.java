package space.itsben.xr8java;


public class Array {
    /*public static void main(String[] args) {
         int a[][] = {{6, 3, 2, 4}, {4, 2, 3, 4}, {6, 3, 2, 4}, {4, 2, 3, 4}, {6, 3, 2, 4}, {4, 2, 3, 4}};
         int b[][] = {{6, 3, 2, 4}, {4, 2, 3, 4}, {6, 3, 2, 4}, {4, 2, 3, 4}, {6, 3, 2, 4}, {4, 2, 3, 4}};
         System.out.println("Hasil A+B");
         //proses perhitungan
         for (int i = 0; i < 6; i++) {
             for (int j = 0; j < 4; j++) {
                 System.out.print(a[i][j]+b[i][j]+"\t");
             }
             System.out.println();
         }
        // //menampilkan hasil
        // for(int i=0;i<2;i++){
        //     for(int j=0;j<2;j++){
        //         System.out.print(h[i][j]+"\t");
        //     }
        //     System.out.println();
        // }
        // a.
        
        
//        int a[][] = { {1,2,3,4,5}, {4,3,2,1} };
//        for (int i=0;i<a.length;i++) printArrln(a[i]);
    }*/
    public static void main(String[] args) {
        int a[][]={{3,2},
                    {6,7},
                    {0, 8}};

        int b[][]={{4, 3, 2},
                    {1, 9, 5}};
        int h[][]= new int[4][4];
        for (int[] hh: h) {
            printArrln(hh);
        }
//        printArrln(h);
        System.out.println("Hasil AxB");
        //proses perhitungan
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<2;k++){
                    System.out.println("H: "+h[i][j] + " + ("+a[i][k]+" * "+b[k][j]+")");
                    h[i][j]=h[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        //menampilkan hasil
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(h[i][j]+"\t");
            }
            System.out.println();
        }
    }
    /**
     * @param arr
     */
    public static void printArrln(int[] arr) {
        System.out.print("[");
        for(int i=0; i<arr.length; i++) System.out.printf("%d%s", arr[i], (i < arr.length - 1? ", " : ""));
        System.out.println("]");
    }
}