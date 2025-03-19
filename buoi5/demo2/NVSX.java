package buoi5.demo2;

public class NVSX extends NhanVien {
    protected double soSanPham;


    public NVSX(String newHoTen, double newDateCongTac, double newSoSanPham ){
        super(newHoTen, newDateCongTac);
        this.soSanPham = newSoSanPham;
    }

    public double getLuong(){
        return soSanPham*10 +phuCap;
    }

    public double getSoSanPham(){
        return soSanPham;
    }

    public void getSoSanPham(double newSoSanPham){
        this.soSanPham = newSoSanPham;
    }



    public String toString(){
        return "Ho ten : "+hoTen+" , So nam cong tac : "+dateCongTac+" , Luong :  "+getLuong()+"\n";
    }
}
