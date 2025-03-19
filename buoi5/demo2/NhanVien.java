package buoi5.demo2;

public class NhanVien {
    protected String hoTen;
    protected double dateCongTac;
    protected double phuCap = 100; 
    protected double luong = 0;

    public NhanVien(){
 
    }

    public NhanVien(String newHoTen, double newDateCongTac){
        this.hoTen = newHoTen;
        this.dateCongTac = newDateCongTac;
    }
    public double newPhuCap(){
        return   phuCap + 20*dateCongTac;
    }

    public void setLuong(double newLuong){
        this.luong = newLuong;
    }

    public double getLuong(){
        return luong + newPhuCap();
    }

    public void setHoTen(String newHoTen){
        this.hoTen = newHoTen;
    }

    public String getHoTen(){
        return hoTen;
    }

    public void setDateCongTac(double newDateCongTac){
        this.dateCongTac = newDateCongTac;
    }

    public Double getDateCongTac(){
        return dateCongTac;
    }

    public String toString(){
        return " Ho ten : "+hoTen+"  Nam cong tac : "+ dateCongTac + " Phu cap :" +phuCap+"\n";
    }
}
