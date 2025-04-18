package buoi9;

public class QuanLyNhanSu {
    public interface TnhLuong {
        double tinhLuong();
    }

    public abstract class NhanVien implements TnhLuong {
        protected String hoTen;
        protected String maNV;
        protected double heSoLuong;

        public NhanVien(){

        }

        public NhanVien(String newHoTen, String newMaNV, double newHeSoLuong){
            this.hoTen = newHoTen;
            this.maNV = newMaNV;
            this.heSoLuong = newHeSoLuong;
        }

        public String getHoTen() {
            return this.hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public String getMaNV() {
            return this.maNV;
        }

        public void setMaNV(String maNV) {
            this.maNV = maNV;
        }

        public double getHeSoLuong() {
            return this.heSoLuong;
        }

        public void setHeSoLuong(double heSoLuong) {
            this.heSoLuong = heSoLuong;
        }
        
        
    }

    public class NhanVienVanPhong extends NhanVien  {
        public NhanVienVanPhong(String newHoTen, String newMaNV, double newHeSoLuong){
            super(newHoTen, newMaNV,newHeSoLuong);
        }
        @Override
        public double tinhLuong() {
            // TODO Auto-generated method stub
            return heSoLuong*3;
        }
        
    }

    public class NhanVienSanXuat extends NhanVien {
        public NhanVienSanXuat(String newHoTen, String newMaNV, double newHeSoLuong){
            super(newHoTen, newMaNV,newHeSoLuong);
        }

        @Override
        public double tinhLuong() {
            // TODO Auto-generated method stub
            return heSoLuong*4;
        }
        
    }

    public static void main(String[] args) {
        QuanLyNhanSu nld = new QuanLyNhanSu();
        NhanVien nvsx = nld.new NhanVienSanXuat("hao","1101",4); 
        System.out.println(nvsx.tinhLuong());
    }
}
