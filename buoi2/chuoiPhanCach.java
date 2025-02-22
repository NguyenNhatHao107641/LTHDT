package buoi2;

import java.util.Scanner;

public class chuoiPhanCach {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        xuatSoChan();
            }
        
            private static void xuatSoChan() {
                System.out.println("Nhap day so ");
                String chuoi = sc.nextLine();
                String[] daySo = chuoi.split(",");
                for(String so : daySo){
                    int x= Integer.parseInt(so);
                    if(x%2==0){
                        System.out.println(x);
                    }
                }
            }
}
