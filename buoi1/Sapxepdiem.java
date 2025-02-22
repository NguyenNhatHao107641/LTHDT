package buoi1;  

import java.util.Scanner;  

class Sapxepdiem {  

    static double diem[] = new double[100];  
    static String ten[] = new String[100];  
    static int n;  

    public static void main(String[] args) {  
        nhap();  
        sapxep();  
        in();  
    }  

    private static void in() {  
        System.out.println("Diem sau khi da sap xep:");  
        for (int i = 0; i < n; i++) {  
            System.out.println(ten[i] + " - " + diem[i]);  
        }  
    }  

    private static void sapxep() {  
        for (int i = 0; i < n - 1; i++) {  
            for (int j = 0; j < n - 1 - i; j++) {  
                if (diem[j] < diem[j + 1]) { 
                    
                    double tempDiem = diem[j + 1];  
                    diem[j + 1] = diem[j];  
                    diem[j] = tempDiem;  

                    String tempTen = ten[j + 1];  
                    ten[j + 1] = ten[j];  
                    ten[j] = tempTen;  
                }  
            }  
        }  
    }  

    private static void nhap() {  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Hay nhap so luong hoc sinh:");  
        n = Integer.parseInt(sc.nextLine());  
        for (int i = 0; i < n; i++) {  
            System.out.println("Nhap ten cua hoc sinh:");  
            ten[i] = sc.nextLine();  
            System.out.println("Nhap diem cua hoc sinh:");  
            diem[i] = Double.parseDouble(sc.nextLine());  
        }  
    }  
}