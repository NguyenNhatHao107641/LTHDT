 package buoi2;

import java.util.Scanner;

public class bieuThucChinhQuy {
    static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        thongTinNV();
            }
        
            private static void thongTinNV() {
               /* 
                String reMatKhau = ".{6,}";
                String reHoTen = "[a-zA-z]+";
                String reEmail = "\\w+@\\w+(\\. \\w+){1,2}";
                String matKhau = sc.nextLine();
                String hoTen = sc.nextLine();
                String email = sc.nextLine(); */
                while (true) {
                    System.out.println("Nhap ma nv (5 ky tu ))");
                    String maNV = sc.nextLine();

                    String reMaNV = "[A-Z]{5}";
                    if(maNV.matches(reMaNV)){
                        //ok 
                        break;
                    }else{
                        System.out.println("vui long nhap lai");
                    }
                }

                while (true) {
                    System.out.println("nhap mat khau ");
                    String matKhau = sc.nextLine();

                    String reMatKhau = ".{6,}";
                    if(matKhau.matches(reMatKhau)){
                        //ok 
                        break;
                    }else{
                        System.out.println("vui long nhap lai");
                    }
                }

                while (true) {
                    System.out.println("nhap ho ten  ");
                    String hoTen = sc.nextLine();

                    String reHoTen = "[a-zA-z]+";

                    if(hoTen.matches(reHoTen)){
                        //ok 
                        break;
                    }else{
                        System.out.println("vui long nhap lai");
                    }
                }
                while (true) {
                    System.out.println("nhap so dien thoai ");
                    String sDT = sc.nextLine();

                    String reSD = "[a-zA-z]+";

                    if(sDT.matches(reSD)){
                        //ok 
                        break;
                    }else{
                        System.out.println("vui long nhap lai");
                    }
                }

                while (true) {
                    System.out.println("nhap CCCD  ");
                    String cCCD = sc.nextLine();

                    String reCCCD = "[a-zA-z]+";

                    if(cCCD.matches(reCCCD)){
                        //ok 
                        break;
                    }else{
                        System.out.println("vui long nhap lai");
                    }
                }

                while (true) {
                    System.out.println("nhap web  ");
                    String web = sc.nextLine();

                    String reWeb = "[a-zA-z]+";

                    if(web.matches(reWeb)){
                        //ok 
                        break;
                    }else{
                        System.out.println("vui long nhap lai");
                    }
                }
            }
 }