package buoi5.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       /*  Nhanvien nv1 = new Nhanvien("Tom", 9000);
        System.out.println(nv1);


        Nhanvien nv2 = new TruongPhong("Jerry", 90000, 40000);
        System.out.println(nv2); */

        /* Nhanvien nv3 = new LaoCong("Manh", 25000,4);
        System.out.println(nv3); */

        ArrayList<Nhanvien> ds = new ArrayList<>();
        while (true) {
            System.out.println("lua chon ");
            String chon = sc.nextLine();

            String k = "k";
            if(chon.equalsIgnoreCase(k)){
                break;
            }

            System.out.println("nhap luong");
            String hoTen = sc.nextLine();
            System.out.println("nhap luong ");
            double luong = Double.parseDouble(sc.nextLine());

            if(chon.equalsIgnoreCase("1")){
                Nhanvien nv = new Nhanvien(hoTen, luong);
                ds.add(nv);
            }else if(chon.equalsIgnoreCase("2")){
                System.out.println("nhap trach nhiem");
                double trachNhiem = Double.parseDouble(sc.nextLine());
                Nhanvien tp = new TruongPhong(hoTen, luong, trachNhiem);
                ds.add(tp);
            }else if(chon.equalsIgnoreCase("3")){
                System.out.println("nhap so gio ");
                double time = Double.parseDouble(sc.nextLine());
                Nhanvien lc = new LaoCong(hoTen, luong, time);
                ds.add(lc);
            }
            
          
        }
        for(Nhanvien nv : ds){
            if(nv.getHoTen().trim().toLowerCase().endsWith("hao")){
                System.out.println(""+nv);
            }
        }
        
    }
}
