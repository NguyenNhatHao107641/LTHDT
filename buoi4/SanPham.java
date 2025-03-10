package buoi4;

public class SanPham {
    private String tenSP;
    private double donGia;
    private double giamGia;

    //constructors
    public SanPham(){
        tenSP = "";
        donGia = 0;
        giamGia = 0;
    }
    public SanPham(String tenSP, double donGia, double giamGia){
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    //getters, setters
    
    //getters san pham
    public String getTenSP(){
        return this.tenSP;
    }
    //setters san pham 
    public void setTenSP(String newTenSP){
        this.tenSP = newTenSP;
    }

    //getters don gia
    public double getDonGia(){
        return this.donGia;
    }
    //setters don gia
    public void setDonGia(double newDonGia){
        this.donGia = newDonGia;
    }

    //getters giam gia
    public double getGiamGia(){
        return this.giamGia;
    }
    //setters giam gia
    public void setGiamGia(double newGiamGia){
        this.donGia = newGiamGia;
    }

    //get thue nhau khau 
    public double getThueNhapKhau(){
        return 0.1 * this.donGia;
    }

    public void nhap(){

    }

    public void xuat(){

    }

    public String toString(){
        return "Ten SP :" + this.tenSP;
    }
}
