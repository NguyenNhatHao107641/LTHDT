package buoi6.demo2;

import java.rmi.StubNotFoundException;

public class NguoiLaoDong {
    protected String hoTen;
    protected double luongCB;


    public NguoiLaoDong(){
        
    }

    public NguoiLaoDong(String newHoTen, double newLuongCB){
        this.hoTen = newHoTen;
        this.luongCB = newLuongCB;
    }

    public double getThuNhap(){
        return luongCB;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongCB() {
        return this.luongCB;
    }

    public void setLuongCB(double luongCB) {
        this.luongCB = luongCB;
    }
}
