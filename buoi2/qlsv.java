package buoi2;

import java.util.ArrayList;
import java.util.Scanner;

public class qlsv {
    static ArrayList<String> dssv = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
            }
        
    private static void menu() {
        while (true) {
            System.out.println("1.Nhap sinh vien");
            System.out.println("2.In ra ten sinh ven ho Nguyen va ten la Tuan");
            System.out.println("3.In ra snh vien co ho lot la My");
            System.out.println("0.Thoat");

            System.out.println("Moi ban chon");
            int n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    nhapSV();
                case 2:
                    inHoaSV();
                case 3:
                    inSVHoLotMy();
                default:
                System.err.println("Ban sai lua chon");
                    break;
            }
        }  
    }
    private static void inSVHoLotMy(){
        for(String sv : dssv){
            if(sv.trim().toLowerCase().contains("my")){
                System.out.println(sv.trim());
            }
        }
    }
    private static void inHoaSV(){
        for(String sv : dssv){
            if(sv.trim().toLowerCase().startsWith("nguyen ") || (sv.trim().toLowerCase().endsWith(" tuan"))){
                System.out.println(sv.trim().toUpperCase());
            }
        }
    }
    private static void nhapSV(){
        while (true) {
            System.out.println("NHap ho ten sv (Enter de kt): ");
            String s = sc.nextLine();
            if(s.isEmpty()) break;
            dssv.add(s);
        }
    }
}
