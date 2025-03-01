package buoi3;

import java.util.Scanner;

public class hinhCN {
    double dai;
    double rong;
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        hinhCN hcn1 = new hinhCN();
        hinhCN hcn2 = new hinhCN();

        hcn1.nhap();
        hcn1.xuat();

        hcn2.nhap();
        hcn2.xuat();
        

        System.out.println("hinh chu nhat co dien tich lon hon la ");
        if(hcn1.getDT()>hcn2.getDT()){
            System.out.println("dai = "+hcn1.dai+" rong = "+hcn1.rong);
        }else {
            System.out.println("dai = "+hcn2.dai+" rong = "+hcn2.rong);
        }
    }
    private void nhap(){
        System.out.println("nhap chieu dai ");
        dai = Double.parseDouble(sc.nextLine());
        System.out.println("nhap chieu rong ");
        rong = Double.parseDouble(sc.nextLine());
    }
    private void xuat(){
        System.out.println("chu vu = "+getCV()+"/n dien tich = "+getDT());
    }
    private double getCV(){
        double CV = (dai + rong)*2;
        return CV;
    }
    private double getDT(){
        double DT = dai * rong;
        return DT;
    }
}
