
import java.util.Scanner;  


//package ontap;

public class demo{
    public static void thueThuNhap(double a,double b){
        double thuNhap = a + b;
        if(thuNhap<9){
            System.out.println("0");
        }else if(thuNhap>=9 && thuNhap<=15){
            System.out.println(thuNhap*(0.1));
        }else{
            System.out.println(thuNhap*(0.15));

        }

    }
    public static void menu(char n){
        switch(n){
            case '+':{
                phepCong();
                break;
            }
            case '-':{
                phepTru();
                break;
            }
        }
    }
    public static void phepCong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap so b: ");
        double b = Double.parseDouble(sc.nextLine());
        double Tong = a+b;
        System.out.println("Tong la :"+Tong);
    }
    public static void phepTru(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap so b: ");
        double b = Double.parseDouble(sc.nextLine());
        double Hieu = a-b;
        System.out.println("Hieu la :"+Hieu);
    }
    // Bai ho ten
    public static void tenHo(){
        String hoTen;
        int tuoi;
        Scanner nhap = new Scanner(System.in);
        tuoi=Integer.parseInt(nhap.nextLine());
        hoTen = nhap.nextLine();
        System.out.println("ht:"+hoTen+"tuoi"+tuoi); 
    }
    //Bai 2
    public static void cangBacHai(double a, double b){
         
        
        System.out.println(Math.sqrt(a+(b-a)*Math.random()));
    }
    public static void luyThua(double a, double b){
         
        
        System.out.println(Math.pow(a, b));
    }
    //Bai 5 
    public static void Mang(int n){
        int[]a = new int[n];
        Scanner sc= new Scanner(System.in);
        for(int i = 0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int tong = 0;
        for(int i : a){
            tong +=i;
        }
        double trungBinhCong = (double)tong/n;
        System.out.print("TBC la:"+trungBinhCong+"\n");
        for(int i : a){
            System.out.print(Math.pow(i, 3));
        }
    }
    public static void main(String[] args) {
        Mang(10);
    }
}