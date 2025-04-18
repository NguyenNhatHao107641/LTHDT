package buoi9.QuanLyNhanSu1;

public class NhanVienVanPhong extends NhanVien {
    public NhanVienVanPhong(String newHoTen, String newMaNV, double newHeSoLuong){
        super(newHoTen, newMaNV,newHeSoLuong);
    }
    @Override
    public double tinhLuong() {
        // TODO Auto-generated method stub
        return heSoLuong*3;
    }
}
