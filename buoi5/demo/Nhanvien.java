package buoi5.demo;

public class Nhanvien {
    protected String hoTen;
    protected double luong;
    
    public Nhanvien(){
        hoTen = "";
        luong = 0;
    }

    public Nhanvien(String newHoTen,double newLuong){
        this.hoTen = newHoTen;
        this.luong = newLuong;
    }

    public String getHoTen(){
        return hoTen;
    }

    public void setHoTen(String newHoTen){
        hoTen = newHoTen;
    }

    public double getLuong(){
        return luong;
    }

    public void setLuong(double newLuong){
        luong = newLuong;
    }

    public double getThuNhap(){
        return luong;
    }

    public String toString(){
        return "NV: " +hoTen +" Luong: " + getThuNhap();
    }


}
