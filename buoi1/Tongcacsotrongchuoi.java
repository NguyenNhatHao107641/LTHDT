package buoi1;

import java.util.Scanner;

public class Tongcacsotrongchuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi can tinh ");
        String n = sc.nextLine();
        for(int i = 0;i<n.length();i++){
            char f = n.charAt(i);
            System.out.println(f);
        }
    }
}
