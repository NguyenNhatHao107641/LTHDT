package buoi7;

public class NoiThanh extends ChuyenXe {
    private int soTuyen;
    private double soKm;
    
    public NoiThanh(String newMaSo, String newHoTenTaiXe, String newSoXe, double newDoanhThu, int newSoTuyen, double newSoKm) {
        super(newMaSo, newHoTenTaiXe, newSoXe, newDoanhThu);
        this.soTuyen = newSoTuyen;
        this.soKm = newSoKm;
    }
    
    @Override
    public String toString() {
        return "Noi thanh - Ma so: " + maSo + ", Tai xe: " + hoTenTaiXe + 
               ", So xe: " + soXe + ", Tuyen: " + soTuyen + 
               ", Km: " + soKm + ", Doanh thu: " + doanhThu;
    }

    public int getSoTuyen() {
        return this.soTuyen;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public double getSoKm() {
        return this.soKm;
    }

    public void setSoKm(double soKm) {
        this.soKm = soKm;
    }
}