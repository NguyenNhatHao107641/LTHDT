package buoi3;

import java.util.Scanner;

public class toaDo {
    int x ;
    int y;
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        toaDo A = new toaDo();
        toaDo B = new toaDo();
        A.nhap();
        A.xuat();

        B.nhap();
        B.xuat();

        System.out.println(A.getKC(B));
        System.out.println(B.getKC(A));

    }
    private void nhap(){
        System.out.println("nhap toa do x");
        x = Integer.parseInt(sc.nextLine());
        System.out.println("nhap toa do y");
        y = Integer.parseInt(sc.nextLine());
    }
    private void xuat(){
        System.out.println("toa do cua diem la ("+x+","+y+")");
    }
     double getKC(toaDo O){
        double x_len = Math.pow(x-O.x,2);
        double y_len = Math.pow(y-O.y, 2);
        return Math.sqrt(x_len+y_len);
    }
}
