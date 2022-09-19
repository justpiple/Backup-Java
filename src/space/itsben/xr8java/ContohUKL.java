package space.itsben.xr8java;

public class ContohUKL {
    //No 1
    /*public static void main(String[] args) {
        int a=5;
        int b=3;
        int n=10;
        int u=a;
        int s=a;
        System.out.println("Deret Aritmatikanya adalah");
        for(int i=0;i<n;i++){
            System.out.println(u);
            u=u+b;
            s=s+u;
        }
        s=s-u;
        System.out.println("Jumlah Deret Aritmatikanya adalah "+s);
    }*/

    //No 2
    /*public static void main(String[] args) {
        int a=5;
        int b=3;
        int u=a;
        int s=a;
        System.out.println("Deret Aritmatikanya adalah");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            System.out.println();
        }
        s=s-u;
        System.out.println("Jumlah Deret Aritmatikanya adalah "+s);
    }*/

    //No 3
    /*public static void main(String[] args) {
        int a=5;
        int b=3;
        int u=a;
        int s=a;
        System.out.println("Deret Aritmatikanya adalah");
        for(int i=0;i<5;i++){
            for(int j=0;j<1+i;j++){
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            System.out.println();
        }
        s=s-u;
        System.out.println("Jumlah Deret Aritmatikanya adalah "+s);
    }*/

    //No 4
    /*public static void main(String[] args) {
        int a=5;
        int b=3;
        int u=a;
        int s=a;
        System.out.println("Deret Aritmatikanya adalah");
        for(int i=0;i<4;i++){
            for(int j=0;j<i;j++){
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            System.out.println();
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2-i;j++){
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            System.out.println();
        }
        s=s-u;
        System.out.println("Jumlah Deret Aritmatikanya adalah "+s);
    }*/

    //Matrix perkalian
    /*public static void main(String[] args) {
        int a[][]={{6,3},{4,8}};
        int b[][]={{1},{2}};
        int h[][]={{0},{0}};
        System.out.println("Hasil AxB");
        //proses perhitungan
        for(int i=0;i<2;i++){
            for(int j=0;j<1;j++){
                for(int k=0;k<2;k++){
                    h[i][j]=h[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        //menampilkan hasil
        for(int i=0;i<2;i++){
            for(int j=0;j<1;j++){
                System.out.print(h[i][j]+"\t");
            }
            System.out.println();
        }
    }*/
    /*public static void main(String[] args) {
        int a[][]={{6,3},{4,8}};
        int b[][]={{1},{2}};
        int h[][]={{0},{0}};
        System.out.println("Hasil AxB");
        //proses perhitungan
        for(int i=0;i<2;i++){
            for(int j=0;j<1;j++){
                *//*System.out.println("Ini adalah J " + j);*//*
                for(int k=0;k<2;k++){
                    *//*System.out.println(a[i][k]*b[k][j] + " "+i+" "+j+" "+k);*//*
                    h[i][0]=h[i][0]+a[i][k]*b[k][0];
                }
            }
        }
        //menampilkan hasil
        for(int i=0;i<2;i++){
            for(int j=0;j<1;j++){
                System.out.print(h[i][j]+"\t");
            }
            System.out.println();
        }
    }*/
    /*public static void main(String[] args) {
        int a[][]={{6,3,2},
                    {4,2,3}};
        int b[][]={{1,2},{2,3},{3,1}};
        int h[][]={{0,0},{0,0}};
        System.out.println("Hasil AxB");
        //proses perhitungan
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<3;k++){
                    h[i][j]=h[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        //menampilkan hasil
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(h[i][j]+"\t");
            }
            System.out.println();
        }
    }*/
    public static void main(String[] args) {
        int a=5;
        int b=3;
        int u=a;
        int s=a;
        System.out.println("Deret Aritmatikanya adalah");
        for(int i=0;i<3;i++){
            for(int j=0;j<3-i;j++){
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            System.out.println();
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2+i;j++){
                System.out.print(u+"\t");
                u=u+b;
                s=s+u;
            }
            System.out.println();
        }
        s=s-u;
        System.out.println("Jumlah Deret Aritmatikanya adalah "+s);
    }
}
