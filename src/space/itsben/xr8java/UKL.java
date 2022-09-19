package space.itsben.xr8java;

public class UKL {
    public static void main(String[] args) {
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
    }
}
