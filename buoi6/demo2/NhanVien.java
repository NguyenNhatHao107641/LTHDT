package buoi6.demo2;

public class NhanVien extends NguoiLaoDong {

    public NhanVien(String newHoTen, double newLuongCB){
        super(newHoTen, newLuongCB);
    }

    @Override
    public double getThuNhap() {
        return luongCB;
    }

    public String toString(){
        return "Ho ten : " + hoTen + ", Luong :  " +luongCB;
    }
    
}
