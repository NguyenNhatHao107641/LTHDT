package buoi6.demo2;

import java.util.ArrayList;
import java.util.Scanner;

import javax.naming.NameAlreadyBoundException;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        ArrayList<NguoiLaoDong> ds = new ArrayList<>();

        while (true) {
            System.out.println("1.Tao danh sach Nguoi lao dong \n"+
                            "2.In danh sach \n"+
                            "3.Tim NLD theo ten va hien thi thong tin tim duoc\n"+
                            "4.Dem so NLD trong danh sach \n"+
                            "0.Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            String lC = sc.nextLine();

            if(lC.equals("0")){
                break;
            }else if (lC.equals("1")){
                
                while (true) {
                    System.out.println("1.Nhan Vien\n"+
                                    "2.QuanLy\n"+
                                    "3.TapVu"+
                                    "0.Thoat");
                    System.out.print("Nhap lua chon cua ban: ");
                    String lC1 = sc.nextLine();
                    

                    if(lC1.equals("0")){
                        break;
                    }else if(lC1.equals("1")){
                        System.out.print("Nhap ho ten : ");
                        String hoTen = sc.nextLine();
                        System.out.print("\nNhap luong co ban: ");
                        double luongCB = Double.parseDouble(sc.nextLine());
                        NguoiLaoDong nV = new NhanVien(hoTen, luongCB);
                        ds.add(nV);
                    }else if(lC1.equals("2")){
                        System.out.print("Nhap ho ten : ");
                        String hoTen = sc.nextLine();
                        System.out.print("\nNhap luong co ban: ");
                        double luongCB = Double.parseDouble(sc.nextLine());
                        System.out.print("Nhap phu cap: ");
                        double phuCap = Double.parseDouble(sc.nextLine());
                        NguoiLaoDong nV = new QuanLy(hoTen, luongCB, phuCap);
                        ds.add(nV);
                    }else if(lC1.equals("3")){
                        System.out.print("Nhap ho ten : ");
                        String hoTen = sc.nextLine();
                        System.out.print("\nNhap luong co ban: ");
                        double luongCB = Double.parseDouble(sc.nextLine());
                        System.out.print("Nhap so gio lam : ");
                        double soGioLamViec = Double.parseDouble(sc.nextLine());
                        NguoiLaoDong nV = new TapVu(hoTen, luongCB, soGioLamViec);
                        ds.add(nV);
                    }else{
                        System.err.println("vui long lua chon lai");
                    }
                }
                
                
            }else if(lC.equals("2")){
                for( NguoiLaoDong nld :ds ){
                    System.out.println(nld.toString());
                }
            }else if (lC.equals("3")){
                System.out.print("nhap ten nguoi muon tim : ");
                String timTen = sc.nextLine();

                boolean v = false;
                for(NguoiLaoDong nld : ds){
                    if(nld.getHoTen().trim().toLowerCase().endsWith(timTen)){
                        System.out.println(nld.toString());
                        v = true;
                    }
                }

                if (!v) {
                    System.out.println("khong co ai ten nhu vay");
                }
            }else if(lC.equals("4")){
                int qL = 0, nV = 0, tV = 0;

                for(NguoiLaoDong nld : ds){
                    if(nld instanceof QuanLy){
                        qL++;
                    }else if (nld instanceof NhanVien){
                        nV++;
                    }else{
                        tV++;
                    }
                }
                System.out.print("so NLD trong danh sach : \n"+
                "Nguoi lao dong : "+ (qL+nV+tV)+
                "\n Nhan vien : "+nV+
                "\n Quan ly : "+qL+
                "\n Tap vu : "+ tV);
            }
            
        }
    }
}
