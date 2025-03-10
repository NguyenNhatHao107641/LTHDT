package buoi4;
import java.util.Scanner;

import javax.xml.validation.Schema;

import buoi4.SanPham;

public class AppSanPham {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham("laptop", 100000, 5);
        sp1.xuat();

        SanPham sp2 = new SanPham();
        System.out.println(sp2);
    }
   
}
