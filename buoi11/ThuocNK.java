package buoi11;

public class ThuocNK extends Thuoc {
    protected int giaNHapKhau;
    protected int soLanNhapKhau;

    public ThuocNK(String ma, String tenThuoc, int donGia, int giaNHapKhau, int soLanNhapKhau){
        super(ma, tenThuoc, donGia);
        this.soLanNhapKhau = soLanNhapKhau;
        this.giaNHapKhau = giaNHapKhau;

    }

    public double getPhuPhi(){
        if(soLanNhapKhau<5){
            return 10;
        }else{
            return 50;
        }
    }

    @Override
    public double giaBan() {
        // TODO Auto-generated method stub
        return giaNHapKhau * soLanNhapKhau +donGia + getPhuPhi();
    }

    public int getGiaNHapKhau() {
        return this.giaNHapKhau;
    }

    public void setGiaNHapKhau(int giaNHapKhau) {
        this.giaNHapKhau = giaNHapKhau;
    }

    public int getSoLanNhapKhau() {
        return this.soLanNhapKhau;
    }

    public void setSoLanNhapKhau(int soLanNhapKhau) {
        this.soLanNhapKhau = soLanNhapKhau;
    }

    public String toString(){
        return "ma : "+ma + "ten thuoc :" + tenThuoc + "don gia :"+donGia + "phi nhap khau: "+giaNHapKhau + "so lan nhap khau"+soLanNhapKhau;
    }
}
