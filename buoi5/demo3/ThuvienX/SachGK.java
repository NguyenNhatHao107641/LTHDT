package buoi5.demo3.ThuvienX;

public class SachGK extends Sach {
    protected String tinhTrang;

    public SachGK(String newMaSach, double newDonGia, double newSoLuong, String newNhaXVB, String newTinhTrang){
        super(newMaSach, newDonGia, newSoLuong, newNhaXVB);
        this.tinhTrang = newTinhTrang;
    }

    public double thanhTien(){
        double thanhTien = 0;
        if(tinhTrang.equalsIgnoreCase("Mới")){
            thanhTien = donGia*soLuong;
        }else if(tinhTrang.equalsIgnoreCase("Cũ")){
            thanhTien = donGia*soLuong*0.5;
        }
        return thanhTien;
    }
}
