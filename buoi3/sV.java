package buoi3;

import java.util.Scanner;

public class sV {
    // 2 thuoc tinh 
    String hoTen;
    double diem;
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        sV a = new sV();
        a.nhap();
        a.xuat();

        sV b = new sV();
        b.nhap();
        b.xuat();
    }

    //cac phuong thuc
    
    private void nhap(){
        System.out.println("Nhap ten cua sinh vien");
        hoTen = sc.nextLine();
        System.out.println("Nhap diem cua sinh vien");
        diem = Double.parseDouble(sc.nextLine());
    }
    private void xuat(){
        if(diem>=9.0){
            System.out.println("xep loai gioi");
        } else if(diem>=8.0){
            System.out.println("xep loai kha");
        }
        else if(diem>=4.0){
            System.out.println("xep loai trung binh");
        }else {
            System.err.println("xep loai yeu");
        }
    }
}

