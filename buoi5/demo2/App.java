package buoi5.demo2;

import java.util.ArrayList;
import java.util.Scanner;

import buoi3.toaDo;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
         ArrayList<NhanVien> ds = new ArrayList<>();
        String lC,hoTen;
        double dateCongTac, mucLuong, soSanPham, soNgayNghi;

         while(true){
            System.err.println("1.Nhap nhan vien san xuat");
            System.err.println("2.Nhap nhan vien van phong");
            System.err.println("3.Nhap nhan vien");
            System.err.println("0.Thoat");

            System.out.print("nhap lua chon cua ban: ");
            lC  = sc.nextLine();
            if (lC.equalsIgnoreCase("0")) {
                break;
            }

            System.out.print("nhap ho ten :");
            hoTen = sc.nextLine();
            System.out.print("nhap so nam cong tac: ");
            dateCongTac = Double.parseDouble(sc.nextLine());
            
            if(lC.equalsIgnoreCase("1")){
                System.out.print("nhap so san pham ");
                soSanPham = Double.parseDouble(sc.nextLine());
                NhanVien nVSX = new NVSX(hoTen, dateCongTac, soSanPham);
                ds.add(nVSX);
            }else if(lC.equalsIgnoreCase("2")){
                System.out.print("nhap muc luong");
                mucLuong = Double.parseDouble(sc.nextLine());
                System.out.print("nhap so ngay nghi ");
                soNgayNghi = Double.parseDouble(sc.nextLine());
                NhanVien nVVP = new NVVP(hoTen, dateCongTac, mucLuong, soNgayNghi);
                ds.add(nVVP);
            }else if(lC.equalsIgnoreCase("3")){
                NhanVien nV = new NhanVien(hoTen, dateCongTac);
            }

         }

         double Tong = 0;

         while (true) {
            System.out.print(   " 1). Đọc danh sách các nhân viên sản xuất, văn phòng từ file (dữ liệu sinh viên tự cho)\r\n" + //
                                " 2). Tính tổng số tiền công ty sẽ trả cho các nhân viên (mỗi nhân viên sẽ có thu nhập là lương + phụ cấp\n" + //
                                " 3). Đưa danh sách các nhân viên có số năm công tác trên 7 năm ra file có tên nhanvien.txt\r\n" + //
                                " 4) Xuất thông tin tất cả nhân viên ra màn hình \n" +
                                " 0). Thoát\n"  );

            System.out.println("nhap lua chon ");
            lC = sc.nextLine();                    
            if (lC.equalsIgnoreCase("0")) {
                break;
            }else if (lC.equalsIgnoreCase("2")) {
                System.out.print("tong luong phai tra la");
                for(NhanVien nV : ds){
                    Tong = Tong + nV.getLuong();
                }
                System.out.print(Tong);
            }else if (lC.equalsIgnoreCase("3")){
                System.out.println("danh sach nhan vien lam viec tren 7 nam ");
                for(NhanVien nV : ds){
                    if (nV.getDateCongTac()>=7) {
                        System.out.print(nV.toString());
                    }
                }
            }else if (lC.equalsIgnoreCase("4")){
                for(NhanVien nV : ds){
                    System.out.print(nV.toString());;
                }
            }else if (lC.equalsIgnoreCase("1")) {
                System.out.print("danh sach nhan vien");
                for(NhanVien nV : ds){
                    System.out.print(nV.toString());
                }
            }
         }  

    }
}
