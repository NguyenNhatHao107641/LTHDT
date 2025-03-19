package buoi5.demo2;

public class NVVP extends NhanVien {
    protected double mucLuong;
    protected double soNgayNghi;

    public NVVP(String newHoTen, double newDateCongTac,double newMucLuong, double newSoNgayNghi){
        super(newHoTen, newDateCongTac);
        this.mucLuong = newMucLuong;
        this.soNgayNghi = newSoNgayNghi;
    }

    public double getLuong(){
        return mucLuong - soNgayNghi*10 +phuCap;
    }

    public void setMucLuong(double newMucLuong){
        this.mucLuong = newMucLuong;
    }

    public double getMucLuong(){
        return mucLuong;
    }

    public void setSoNgayNghi(double newSoNgayNghi){
        this.soNgayNghi = newSoNgayNghi;
    }

    public double getSoNgayNghi(){
        return soNgayNghi;
    }

    public String toString(){
        return "Ho ten : "+hoTen+" , So nam cong tac : "+dateCongTac+" , Luong :  "+getLuong()+"\n";
    }
}
