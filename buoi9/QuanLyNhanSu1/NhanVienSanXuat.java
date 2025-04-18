package buoi9.QuanLyNhanSu1;

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
