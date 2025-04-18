package buoi7;

public class ChuyenXe {
    protected String maSo;
    protected String hoTenTaiXe;
    protected String soXe;
    protected double doanhThu;

    
    public ChuyenXe(String newMaSo, String newHoTenTaiXe, String newSoXe, double newDoanhThu) {
        this.maSo = newMaSo;
        this.hoTenTaiXe = newHoTenTaiXe;
        this.soXe = newSoXe;
        this.doanhThu = newDoanhThuoanhThu;
    }
    
    public double getDoanhThu() {
        return doanhThu;
    }

    public String getMaSo() {
        return this.maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTenTaiXe() {
        return this.hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public String getSoXe() {
        return this.soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return this.doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
}