package buoi3.bt;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class sV {
    String hoTen, ngaySinh, gioiTinh, lop;
    int toan, li, hoa, dTB;
    static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            System.out.print("Nhap so luong hoc sinh");
            int n = Integer.parseInt(sc.nextLine());
        sV[] sV = new sV[n];
        for(int i = 0; i<n; i++){
            sV[i] = new sV();
            sV[i].nhap();
            //sV[i].diemTB();
        }
        for(int i = 0 ; i < n ; i++ ){
            for(int j = 0; j < n - 1 -i; j++ ){
                if(sV[j].diemTB() < sV[j+1].diemTB()){
                    sV tam = sV[j];
                    sV[j] = sV[j+1];
                    sV[j+1] = tam;

                }
            }
        }
        for(int i = 0; i<n; i++){
            sV[i].xuat();
        }
    }
    private void nhap(){
        System.out.print("nhap ten sv: ");
        hoTen = sc.nextLine();
        System.out.print("nhap ngay sinh sv: ");
        ngaySinh = sc.nextLine();
        System.out.print("nhap gioi tinh sv: ");
        gioiTinh = sc.nextLine();
        System.out.print("nhap lop sv: ");
        lop = sc.nextLine();
        System.out.print("nhap diem toan sv: ");
        toan = Integer.parseInt(sc.nextLine());
        System.out.print("nhap diem li sv: ");
        li = Integer.parseInt(sc.nextLine());
        System.out.print("nhap diem hoa sv: ");
        hoa = Integer.parseInt(sc.nextLine());
    }
    private int diemTB(){
        dTB = (toan + li + hoa)/3;
        return dTB;
    }
    private void xuat(){
        System.out.println("Ten :" +hoTen);
        System.out.println("Ngay sinh :" +ngaySinh);
        System.out.println("Gioi tinh :" +gioiTinh);
        System.out.println("Lop :" +lop);
        System.out.println("Diem TB :" +dTB);

    }
}
