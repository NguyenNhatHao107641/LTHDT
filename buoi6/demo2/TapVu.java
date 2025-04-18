package buoi6.demo2;

public class TapVu extends NguoiLaoDong {

    protected double soGioLamViec;

   

    public TapVu(String newHoTen, double newLuongCB, double newSoGioLamViec){
        super(newHoTen, newLuongCB);
        this.soGioLamViec = newSoGioLamViec;
    }

    @Override
    public double getThuNhap() {
        return   soGioLamViec * 25;
    }

    public double getSoGioLamViec() {
        return this.soGioLamViec;
    }

    public void setSoGioLamViec(double soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }

    public String toString(){
        return "Ho ten : " + hoTen + ", Luong :  " +getThuNhap() + ", So gio lam : " +soGioLamViec;
    }
    
}
