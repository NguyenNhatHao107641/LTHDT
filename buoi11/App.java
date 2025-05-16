package buoi11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collector;

public class App {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Thuoc> ds = new ArrayList<>();
    public static void nhap(){
        while(true){
            System.out.println("1.Nhap thuoc ND");
            System.out.println("2.Nhap thuoc NK");
            System.out.println("0.Thoat");
            System.out.print("Hay dua ra lua chon");
            String lC = sc.nextLine();


            if (lC.equals("0")){
                break;
            }
            
            System.out.print("Nhap ma thuoc");
            String ma = sc.nextLine();
            System.out.print("\nNhap ten thuoc");
            String teThuoc = sc.nextLine();
            System.out.print("\nNhap don gia");
            int donGia = Integer.parseInt(sc.nextLine());
            
            if(lC.equals("1")){
                System.out.print("\nNhap gia bao quan ");
                int giaBaoQuan = Integer.parseInt(sc.nextLine());
                System.out.print("\nNhap gia van chuyen ");
                int giaVanChuyen = Integer.parseInt(sc.nextLine());
                ds.add(new ThuocND(ma, teThuoc, donGia, giaBaoQuan, giaVanChuyen));
            }else if(lC.equals("2")){
                System.out.print("\nNhap phi  nhap khau ");
                int phiNhapKhau = Integer.parseInt(sc.nextLine());
                System.out.print("\nNhap so lan nhap khau ");
                int soLanNhapKhau = Integer.parseInt(sc.nextLine());
                ds.add(new ThuocNK(ma, teThuoc, donGia, phiNhapKhau, soLanNhapKhau));
            }
        }
    }

    public static void in(){
        for(Thuoc thuoc : ds){
            System.out.println(thuoc.toString());
        }
    }

    public static void inThuocNK(){
        for(Thuoc thuoc : ds){
            if(thuoc instanceof ThuocNK & thuoc.giaBan()>=100){
                System.out.println(thuoc.toString());
            }
        }
    }

    public static void timThuoc(){
        System.out.println("Nhap ma thuoc can tim");
        String tim = sc.nextLine();
        for(Thuoc thuoc : ds){
            if(thuoc.getMa().equalsIgnoreCase(tim)){
                System.out.println(thuoc.toString());
            }
        }
    }

    public static void sapXep(){
        Collections.sort(ds, Comparator.comparingDouble(Thuoc::giaBan).reversed());
        for(Thuoc t : ds)System.out.println(t.toString());
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1.Nhap thuoc");
            System.out.println("2.In ra thuoc");
            System.out.println("3.In thuoc NK có giá trên 100");
            System.out.println("4.Tim thuoc");
            System.out.println("5.Sap xep thuoc dua tren gia thuco");
            System.out.println("0.Thoat");


            System.out.print("Nhap lua chon cua ban :");
            String lC = sc.nextLine();
            if (lC.equals("0")) {
                break;
            }else if(lC.equals("1")){
                nhap();
            }else if(lC.equals("2")){
                in();
            }else if(lC.equals("3")){
                inThuocNK();
            }else if(lC.equals("4")){
                timThuoc();
            }else if(lC.equals("5")) sapXep();
        }
    }

}
