package buoi7;

public class NgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgay;
    
    public NoiThanh(String newMaSo, String newHoTenTaiXe, String newSoXe, double newDoanhThu, String newNoiDen, int newSoNgay) {
        super(newMaSo, newHoTenTaiXe, newSoXe, newDoanhThu);
        this.noiDen = newNoiDen;
        this.soNgay = newSoNgay;
    }
    
    @Override
    public String toString() {
        return "Ngoai thanh - Ma so: " + maSo + ", Tai xe: " + hoTenTaiXe + 
               ", So xe: " + soXe + ", Noi den: " + noiDen + 
               ", So ngay: " + soNgay + ", Doanh thu: " + doanhThu;
    }
}