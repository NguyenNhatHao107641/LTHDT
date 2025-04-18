package buoi11;

public class ThuocND extends Thuoc {
    protected int giaBaoQuan;
    protected int giaVanChuyen;

    public ThuocND(String ma, String tenThuoc, int donGia, int giaBaoQuan, int giaVanChuyen){
        super(ma, tenThuoc, donGia);
        this.giaBaoQuan = giaBaoQuan;
        this.giaVanChuyen = giaVanChuyen;
    }

    @Override
    public double giaBan() {
        // TODO Auto-generated method stub
        return  giaBaoQuan + giaVanChuyen + donGia;
    }

    public int getGiaBaoQuan() {
        return this.giaBaoQuan;
    }

    public void setGiaBaoQuan(int giaBaoQuan) {
        this.giaBaoQuan = giaBaoQuan;
    }

    public int getGiaVanChuyen() {
        return this.giaVanChuyen;
    }

    public void setGiaVanChuyen(int giaVanChuyen) {
        this.giaVanChuyen = giaVanChuyen;
    }

    public String toString(){
        return "ma : "+ma + "ten thuoc :" + tenThuoc + "don gia :"+donGia + "gia bao quan: "+giaBaoQuan + "gia van chuyen "+giaVanChuyen;
    }
}
