package buoi7;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    ArrayList<ChuyenXe> listChuyenXe = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    void nhapDS() {
        while(true) {
            System.out.println("Chon loai xe (1-Noi thanh, 2-Ngoai thanh, 0-Thoat):");
            String lC = sc.nextLine();
            if(lC.equalsIgnoreCase("0")) break;
            
            System.out.println("Nhap ma so:");
            String maSo = sc.nextLine();
            System.out.println("Nhap ho ten tai xe:");
            String hoTen = sc.nextLine();
            System.out.println("Nhap so xe:");
            String soXe = sc.nextLine();
            System.out.println("Nhap doanh thu:");
            double doanhThu = Double.parseDouble(sc.nextLine());
            
            if(lC.equalsIgnoreCase("1")) {
                System.out.println("Nhap so tuyen:");
                int soTuyen = Integer.parseInt(sc.nextLine());
                System.out.println("Nhap so km:");
                double soKm = Double.parseDouble(sc.nextLine());
                listChuyenXe.add(new NoiThanh(maSo, hoTen, soXe, doanhThu, soTuyen, soKm));
            } else if(lC.equalsIgnoreCase("2")) {
                System.out.println("Nhap noi den:");
                String noiDen = sc.nextLine();
                System.out.println("Nhap so ngay:");
                int soNgay = Integer.parseInt(sc.nextLine());
                listChuyenXe.add(new NgoaiThanh(maSo, hoTen, soXe, doanhThu, noiDen, soNgay));
            }else {
                System.out.println("vui long dua ra lua chon");
            }
        }
    }
    
    void xuatDS() {
        for(ChuyenXe xe : listChuyenXe) {
            System.out.println(xe.toString());
        }
    }
    
    void tinhTongDoanhThu() {
        double tongNoiThanh = 0, tongNgoaiThanh = 0;
        
        for(ChuyenXe xe : listChuyenXe) {
            if(cx instanceof NoiThanh)
                tongNoiThanh += xe.getDoanhThu();
            else
                tongNgoaiThanh += xe.getDoanhThu();
        }
        
        System.out.println("Tong doanh thu xe noi thanh: " + tongNoiThanh);
        System.out.println("Tong doanh thu xe ngoai thanh: " + tongNgoaiThanh);
    }

    void timChuyenXeTheoMa() {
        System.out.println("Nhap ma so can tim:");
        String maSo = sc.nextLine();
        for (ChuyenXe xe : listChuyenXe) {
            if (xe.maSo.equals(maSo)) {
                System.out.println(xe.toString());
                return;
            }
        }
        System.out.println("Khong tim thay chuyen xe voi ma so: " + maSo);
    }

    void inChuyenXeDoanhThuCaoNhat() {
        if (listChuyenXe.isEmpty()) {
            System.out.println("Danh sach chuyen xe rong.");
            return;
        }
        ChuyenXe maxDoanhThuXe = listChuyenXe.get(0);
        for (ChuyenXe xe : listChuyenXe) {
            if (xe.getDoanhThu() > maxDoanhThuXe.getDoanhThu()) {
                maxDoanhThuXe = xe;
            }
        }
        System.out.println("Chuyen xe co doanh thu cao nhat:");
        System.out.println(maxDoanhThuXe);
    }
    
    void menu() {
        while(true) {
            System.out.println("\n1. Nhap danh sach chuyen xe");
            System.out.println("2. Xuat danh sach chuyen xe");
            System.out.println("3. Tinh tong doanh thu");
            System.out.println("4. Tim chuyen xe theo ma so");
            System.out.println("5. In chuyen xe co doanh thu cao nhat");
            System.out.println("0. Thoat");
            
            int chon = Integer.parseInt(sc.nextLine());
            if(chon == 0) break;
            
            switch(chon) {
                case 1: nhapDS(); break;
                case 2: xuatDS(); break;
                case 3: tinhTongDoanhThu(); break;
                case 4: timChuyenXeTheoMa(); break;
                case 5: inChuyenXeDoanhThuCaoNhat(); break;
            }
        }
    }
    
    public static void main(String[] args) {
        new App().menu();
    }
}