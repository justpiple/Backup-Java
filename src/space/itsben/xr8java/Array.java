package space.itsben.xr8java;


public class Array {
    public static void main(String[] args) {
         int a[][] = {{6, 3, 2}, {4, 2, 3}};
         int b[][] = {{6, 3, 2}, {4, 2, 3}};
         System.out.println("Hasil A+B");
         //proses perhitungan
         for (int i = 0; i < 2; i++) {
             for (int j = 0; j < 3; j++) {
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