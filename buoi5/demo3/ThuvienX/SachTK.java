package buoi5.demo3.ThuvienX;

public class SachTK extends Sach {
    protected double thue;

    public SachTK(String newMaSach, double newDonGia, double newSoLuong, String newNhaXVB,double newThue){
        super(newMaSach, newDonGia, newSoLuong, newNhaXVB);
        this.thue = newThue;
    }

    public double thanhTien(){
        return soLuong * donGia + thue;
    }
}
