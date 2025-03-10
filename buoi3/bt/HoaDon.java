package buoi3.bt;

import java.util.Scanner;

public class HoaDon {
    String maVT, tenVT, loaiPhieu, ngayLap;
    double khoiLuong, donGia, thanhTien;
    static Scanner sc  = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("nhap so luong hoa don");
        int n = Integer.parseInt(sc.nextLine());
        HoaDon[] dSHoaDon = new HoaDon[n];
        for(HoaDon x : dSHoaDon){
            x = new HoaDon();
            x.nhap();
        }
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n -1 -i; j++){
                if(dSHoaDon[j].getThanhTien()<dSHoaDon[j+1].getThanhTien()){
                    HoaDon tam = dSHoaDon[j];
                    dSHoaDon[j] = dSHoaDon[j+1];
                    dSHoaDon[j+1]= tam;
                }
            }
        }
    }
    public void nhap(){
        System.out.print("nhap ma vat tu ");
        maVT = sc.nextLine();
        System.out.print("nhap ten vat tu ");
        tenVT = sc.nextLine();
        System.out.print("nhap loai phieu ");
        loaiPhieu = sc.nextLine();
        System.out.print("nhap ngay lap ");
        ngayLap = sc.nextLine();
        System.out.print("nhap khoi luong vat tu ");
        khoiLuong = Double.parseDouble(sc.nextLine());
        System.out.print("nhap don gia vat tu ");
        donGia = Double.parseDouble(sc.nextLine());
        


    }

    public double getThanhTien(){
        return donGia * khoiLuong;
    }

    public void xuat(){
        System.out.println(" ma vat tu "+maVT);
        System.out.println(" ten vat tu "+tenVT);
        System.out.println(" loai phieu "+loaiPhieu);
        System.out.println(" ngay lap "+ngayLap);
        System.out.println(" khoi luong vat tu "+khoiLuong);
        System.out.println(" don gia vat tu "+donGia);
        System.out.println(" thanh tien vat tu "+thanhTien);
}
}
