package buoi6.demo1;

public class App {
    public static void main(String[] args) {
        ChuNhat v = new Vuong(7);
        v.xuat();
        ChuNhat cn1 = new ChuNhat(7,8);
        ChuNhat cn2 = new ChuNhat(9,1);
        cn1.xuat();
        cn2.xuat();
    }
    
}