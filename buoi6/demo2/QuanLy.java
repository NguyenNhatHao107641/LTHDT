package buoi6.demo2;

public class QuanLy extends NguoiLaoDong {
    protected double phuCap;

    public QuanLy( String newHoTen, double newLuongCB,double newPhuCap){
        super(newHoTen, newLuongCB);
        this.phuCap = newPhuCap;
    }

    @Override
    public double getThuNhap() {
        return luongCB + phuCap;
    }
    
    
    public double getPhuCap() {
        return this.phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    public String toString(){
        return "Ho ten : " + hoTen + ", Luong :  " +getThuNhap() + ", Phu cap : " +phuCap;
    }
}
