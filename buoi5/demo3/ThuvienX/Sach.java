package buoi5.demo3.ThuvienX;

public class Sach {
    protected String maSach,nhaXB;
    protected double donGia, soLuong;

    public Sach(){

    }

    public Sach(String newMaSach, double newDonGia, double newSoLuong, String newNhaXVB ){
        this.maSach = newMaSach;
        this.donGia = newDonGia;
        this.soLuong = newSoLuong;
        this.nhaXB = newNhaXVB;
    }

    public double thanhTien(){
        return donGia*soLuong;
    }
}
