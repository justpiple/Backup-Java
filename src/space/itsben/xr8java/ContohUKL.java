package space.itsben.xr8java;

public class ContohUKL {
    public static void main(String[] args) {
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
    }
}
