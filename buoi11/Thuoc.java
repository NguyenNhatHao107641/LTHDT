package buoi11;

import java.lang.classfile.Interfaces;

import buoi11.IThuoc;

public abstract class Thuoc implements IThuoc {
    protected String ma;
    protected String tenThuoc;
    protected int donGia;

    public Thuoc(String ma, String tenThuoc, int donGia){
        this.ma = ma;
        this.tenThuoc = tenThuoc;
        this.donGia = donGia;
    }


    public String getMa() {
        return this.ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenThuoc() {
        return this.tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public int getDonGia() {
        return this.donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
}
