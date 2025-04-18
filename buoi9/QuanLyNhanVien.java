package buoi9;

public class QuanLyNhanVien {
    public interface InnerQuanLyNhanVien  {
        public double getThuNhap();
    }

    public abstract class  NguoiLaoDong implements InnerQuanLyNhanVien {
        String hoTen;
        double luongCB;

        public String getHoTen() {
            return this.hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public double getLuongCB() {
            return this.luongCB;
        }

        public void setLuongCB(double luongCB) {
            this.luongCB = luongCB;
        }



        public NguoiLaoDong(){

        }

        public NguoiLaoDong(String newHoTen, double newLuongCB){
            this.hoTen = newHoTen;
            this.luongCB = newLuongCB;

        }

    }

    public class QuanLy extends NguoiLaoDong  {
        double phuCap;

        public double getPhuCap() {
            return this.phuCap;
        }

        public void setPhuCap(double phuCap) {
            this.phuCap = phuCap;
        }


        
        public QuanLy(String newHoTen, double newLuongCB, double newPhuCap){
            super(newHoTen, newLuongCB);
            this.phuCap = newPhuCap;
        }

        @Override
        public double getThuNhap() {
            // TODO Auto-generated method stub
            return luongCB + phuCap;
        }
        
    }

    public class TapVu extends NguoiLaoDong {
        double soGioLamViec;

        public double getSoGioLamViec() {
            return this.soGioLamViec;
        }

        public void setSoGioLamViec(double soGioLamViec) {
            this.soGioLamViec = soGioLamViec;
        }


        
        public TapVu(String newHoTen, double newLuongCB, double newSoGioLamViec){
            super(newHoTen, newLuongCB);
            this.soGioLamViec = newSoGioLamViec;
        }

        @Override
        public double getThuNhap() {
            // TODO Auto-generated method stub
            return soGioLamViec *25;
        }

    }

    public class NhanVien extends NguoiLaoDong   {
        public NhanVien(String newHoten, double newLuongCB){
            super(newHoten, newLuongCB);
        }

        @Override
        public double getThuNhap() {
           // TODO Auto-generated method stub
            return luongCB;
        }
            
    }


    public static void main(String[] args) {
        QuanLyNhanVien nld = new QuanLyNhanVien();
        NguoiLaoDong tv = nld.new TapVu("hao", 400, 5);
        System.out.println(tv.getThuNhap());

    }


}
