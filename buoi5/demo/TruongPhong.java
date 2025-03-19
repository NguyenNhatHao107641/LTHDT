package buoi5.demo;

public class TruongPhong extends Nhanvien {
    private double trachNhiem;

    public TruongPhong(){
        super();    // goi contruster cua lop cha
        trachNhiem = 0;
    }

    public TruongPhong(String hoTen, double luong, double trachNhiem){
        super(hoTen ,luong);
        this.trachNhiem = trachNhiem;
    }

    public double getTrachNhiem(){
        return trachNhiem;
    }

    public void setTrachNhiem(double newTrachNhiem){
        trachNhiem = newTrachNhiem;
    }

    public double getThuNhap(){
         return luong + trachNhiem;
    }

    
}
